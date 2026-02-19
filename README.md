# WegOneRefactor - Documentação

## 📋 Diagnóstico do Problema

### Identificação da Violação do Open/Closed Principle (OCP)

A estrutura anterior apresentava graves violações do OCP através de:

1. **Múltiplas Camadas de if/else em Cascata**
   - Cada nova funcionalidade exigia modificação do código existente
   - Exemplo: Adicionar novo idioma significava editar a classe principal

2. **Duplicação de Lógica**
   - Mesmo bloco de switch case repetido 3 vezes (uma para cada idioma)

3. **Responsabilidades Misturadas**
   - Apresentação da UI
   - Lógica de negócio
   - Controle de fluxo (navegação entre menus)
   - Gerenciamento de idiomas

**Impactos:**
- ❌ Difícil de testar 
- ❌ Difícil de manter (mudanças em um ponto afetam múltiplos lugares)
- ❌ Código frágil (um pequeno erro cascata por toda aplicação)

---

## 🏗️ Justificativa da Arquitetura em Camadas

### Por que o Padrão em Camadas?

A arquitetura em camadas foi escolhida porque oferece:

#### 1. **Separação de Responsabilidades**
Cada camada tem uma responsabilidade única e bem definida:

```
┌─────────────────────────────────────┐
│         VIEW LAYER                  │
│  (Menu.java, MetodosCRUDImpl.java)  │
│  ✓ Apresentação                     │
│  ✓ Interação com Usuário            │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│      SERVICE LAYER                  │
│  (OrientacoesService.java)          │
│  ✓ Lógica de Negócio                │
│  ✓ Validações                       │
│  ✓ Orchestração                     │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│    REPOSITORY LAYER                 │
│  (OrientacoesRepository.java)       │
│  ✓ Acesso a Dados                   │
│  ✓ Operações CRUD                   │
│  ✓ SQL & Banco de Dados             │
└─────────────────────────────────────┘
```

#### 2. **Vantagens da Abordagem em Camadas**

| Aspecto | Benefício |
|---------|-----------|
| **Manutenção** | Mudanças em uma camada não afetam outras |
| **Reutilização** | Serviços podem ser usados por múltiplas views |
| **Escalabilidade** | Fácil adicionar novas funcionalidades |
| **Compreensão** | Novo dev entende fluxo rapidamente |


### Comparação: Antes vs Depois

#### ❌ ANTES (Monolítico)
```java
// Main.java - 500+ linhas
public void exibirMenu() {
    // Menu UI
    System.out.println("...");
    
    // Validação
    while(true) { /* ... */ }
    
    // Lógica de Negócio
    if(arquivo.equals("pt.json")) {
        switch(tipoOrientacao) {
            case 1: manualOperacao.cadastrarManual(); break;
            case 2: procedimentoSeguranca.cadastrarManual(); break;
            // ... 20+ casos
        }
    }
    
    // Duplicado para "en.json" e "de.json"
    if(arquivo.equals("en.json")) { /* ... */ }
    if(arquivo.equals("de.json")) { /* ... */ }
}
```

#### ✅ DEPOIS (Camadas)
```java
// Menu.java - Apenas apresentação
public void exibirMenu() {
    Map<Integer, Runnable> opcoes = new HashMap<>();
    opcoes.put(1, crud::cadastrar);    // Delegação clara
    opcoes.put(2, crud::pesquisar);
    // ...
    Runnable acao = opcoes.get(opcao);
    if(acao != null) acao.run();
}

// MetodosCRUDImpl.java - Coordena UI e Service
@Override
public void cadastrar() {
    String titulo = Sc.lerString();    // Input
    service.cadastrar(orientacao);     // Delegação
}

// OrientacoesService.java - Lógica pura
@Override
public Orientacao cadastrar(Orientacao orientacao) {
    return repository.cadastrar(orientacao);
}

// OrientacoesRepository.java - Apenas Data Access
@Override
public Orientacao cadastrar(Orientacao orientacao) {
    String query = "INSERT INTO orientacoes...";
    // Apenas SQL
}
```

---

## 🚀 Análise de Extensibilidade

### Como o Novo Design Facilita Extensão

#### 1. **Adicionar Nova Categoria de Orientação**

❌ **Antes:**
```
Modificar: 
- Menu (adicionar opção)
- View (adicionar método para cada idioma)
- Main (adicionar switch case para cada idioma)
- 3x duplicação de código
```

✅ **Depois:**
```
Apenas criar nova classe que implementa a mesma interface:

public class NovaCategoria {
    public void cadastrar() { /* ... */ }
}

// Adicionar ao service:
private NovaCategoria novaCategoria;
// Pronto! Sem modificar código existente.
```

#### 2. **Mudar Banco de Dados (MySQL → PostgreSQL)**

❌ **Antes:**
- Modificar 50+ linhas de SQL espalhadas no código
- Risco de quebrar menu ou validação

✅ **Depois:**
```
Criar nova implementação:
public class OrientacoesRepositoryPostgreSQL implements OrientacoesRepository {
    @Override
    public Orientacao cadastrar(Orientacao orientacao) {
        // PostgreSQL específico
    }
}

// Trocar injeção em Main
OrientacoesRepository repository = new OrientacoesRepositoryPostgreSQL();
// Resto do código não muda!
```

#### 3. **Adicionar Validação de Negócio**

❌ **Antes:**
- Modificar método de cadastro no menu
- Risco de afetar outras operações

✅ **Depois:**
```java
// Service (local correto):
@Override
public Orientacao cadastrar(Orientacao orientacao) {
    if(orientacao.getTitulo().length() < 5) {
        throw new BusinessException("Título muito curto");
    }
    return repository.cadastrar(orientacao);
}
```

---

## 💉 Conceitos de Injeção de Dependência

### O que é Injeção de Dependência?

Injeção de Dependência (Dependency Injection - DI) é um padrão de design que permite que um objeto receba suas dependências de fora, em vez de criá-las internamente.

### Por que Usar DI?

#### 1. **Desacoplamento**

❌ **Sem DI (Acoplado):**
```java
public class MetodosCRUDImpl {
    private OrientacoesService service = new OrientacoesServiceImpl();
    // MetodosCRUDImpl está FORTEMENTE acoplado a OrientacoesServiceImpl
    // Não posso trocar para outra implementação sem modificar código
}
```

✅ **Com DI (Desacoplado):**
```java
public class MetodosCRUDImpl {
    private final OrientacoesService service;
    
    public MetodosCRUDImpl(OrientacoesService service) {
        this.service = service;  // Recebe de fora
    }
    // MetodosCRUDImpl depende da INTERFACE, não da implementação
}
```

#### 2. **Flexibilidade**

```java
// Mesma classe, diferentes comportamentos:

// Produção
OrientacoesRepository repoSQL = new OrientacoesRepositoryImpl();
OrientacoesService service = new OrientacoesServiceImpl(repoSQL);
MetodosCRUDImpl crud = new MetodosCRUDImpl(service);

// Teste
OrientacoesRepository repoMock = mock(OrientacoesRepository.class);
OrientacoesService serviceMock = new OrientacoesServiceImpl(repoMock);
MetodosCRUDImpl crudTest = new MetodosCRUDImpl(serviceMock);

// Desenvolvimento (em memória)
OrientacoesRepository repoMemory = new OrientacoesRepositoryInMemory();
OrientacoesService serviceDev = new OrientacoesServiceImpl(repoMemory);
MetodosCRUDImpl crudDev = new MetodosCRUDImpl(serviceDev);
```

### Implementação no Projeto

#### Exemplo 1: View depende de Service

```java
public class MetodosCRUDImpl implements MetodosCRUDView {
    private final OrientacoesService service;  // Injetada
    
    public MetodosCRUDImpl(OrientacoesService service) {
        this.service = service;
    }
    
    @Override
    public void cadastrar() {
        String titulo = Sc.lerString();
        service.cadastrar(new Orientacao(titulo, conteudo, categoria));
    }
}
```


#### Exemplo 2: Service depende de Repository

```java
public class OrientacoesServiceImpl implements OrientacoesService {
    private final OrientacoesRepository repository;  // Injetada
    
    public OrientacoesServiceImpl(OrientacoesRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Orientacao cadastrar(Orientacao orientacao) {
        // Não sabe COMO persiste, apenas delega
        return repository.cadastrar(orientacao);
    }
}
```
---
## 👩‍💻 Autores
**Elis Jasper**  
📧 Email: elis_jasper@estudante.sesisenai.org.br  
🔗 GitHub: [Liiiiisssz](https://github.com/Liiiiisssz)  

**Kael Luih de Araujo**  
📧 Email: kael_araujo@estudante.sesisenai.org.br  
🔗 GitHub: [KaelLuih](https://github.com/KaelLuih)  

---

**Referências Teóricas:**
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
- [Layered Architecture](https://www.oreilly.com/library/view/software-architecture-patterns/9781491971437/ch01.html)
- [Dependency Injection](https://www.baeldung.com/inversion-of-control-and-dependency-injection-in-spring)
