package br.com.senai.centroweg.wegone.view;

import br.com.senai.centroweg.wegone.exception.BusinessException;
import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacao;
import br.com.senai.centroweg.wegone.service.OrientacoesService;
import br.com.senai.centroweg.wegone.util.Sc;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final OrientacoesService service;
    public Menu(OrientacoesService service) {
        this.service = service;
    }

    public void exibirMenu(){
        Map<Integer, Runnable> opcoes = new HashMap<>();
        while(true){
            System.out.println("""
                 ______________________________
                | 1.  Cadastrar Orientação     |
                | 2.  Pesquisar Orientação     |
                | 3.  Exibir todas             |
                | 4.  Editar Orientação        |
                | 5.  Excluir Orientação       |
                |------------------------------|
                | 6. X ENCERRAR PROGRAMA X     |
                |______________________________|
                """);
            int opcao = Sc.lerInt();

            opcoes.put(1, this::cadastrar);
            opcoes.put(2, this::pesquisar);
            opcoes.put(3, this::todas);
            opcoes.put(4, this::editar);
            opcoes.put(5, this::excluir);
            opcoes.put(6, () -> {
                System.out.println("Encerrando...");
                System.exit(0);
            });

            Runnable acao = opcoes.get(opcao);
            if (acao != null) {
                acao.run();
            } else {
                System.out.println("Número inválido!");
            }
        }
    }

    private void cadastrar(){
        System.out.println("\n===== CADASTRAR ORIENTAÇÃO =====");
        System.out.println("Título:");
        String titulo = Sc.lerString();
        System.out.println("Conteúdo:");
        String conteudo = Sc.lerString();
        System.out.println("Categoria:");
        String categoria = Sc.lerString().toUpperCase();

        System.out.println("\n\nOrientação cadastrada com sucesso!\n\n");
        System.out.println(service.cadastrar(new Orientacao(
                titulo, conteudo, Categoria.valueOf(categoria)
        )));
    }

    private void todas(){
        var lista = service.todas();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma orientação cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE ORIENTAÇÕES =====");

        for (Orientacao o : lista) {
            System.out.println("ID: " + o.getId());
            System.out.println("Título: " + o.getTitulo());
            System.out.println("Conteúdo: " + o.getConteudo());
            System.out.println("Categoria: " + o.getCategoria());
            System.out.println("---------------------------------");
        }
    }

    private void pesquisar(){
        System.out.println("\n===== PESQUISAR ORIENTAÇÃO =====");
        System.out.println("ID da orientação:");
        int id = Sc.lerInt();
        System.out.println(service.pesquisar(id));
    }

    private void editar(){
        System.out.println("\n===== EDITAR ORIENTAÇÃO =====");
        System.out.println("ID da orientação:");
        int id = Sc.lerInt();

        try {
            Orientacao existente = service.pesquisar(id);

            System.out.println("Título atual: " + existente.getTitulo());
            System.out.println("Novo título (pressione ENTER para manter):");
            String titulo = Sc.lerString();

            System.out.println("Conteúdo atual: " + existente.getConteudo());
            System.out.println("Novo conteúdo (pressione ENTER para manter):");
            String conteudo = Sc.lerString();

            System.out.println("Categoria atual: " + existente.getCategoria());
            System.out.println("Nova categoria (pressione ENTER para manter):");
            String categoriaStr = Sc.lerString();

            if (titulo.isBlank()) {
                titulo = existente.getTitulo();
            }

            if (conteudo.isBlank()) {
                conteudo = existente.getConteudo();
            }

            Categoria categoria = existente.getCategoria();
            if (!categoriaStr.isBlank()) {
                categoria = Categoria.valueOf(categoriaStr.toUpperCase());
            }

            Orientacao atualizada = new Orientacao(
                    titulo,
                    conteudo,
                    categoria
            );

            service.editar(atualizada, id);

            System.out.println("Orientação atualizada com sucesso!");

        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }

    private void excluir(){
        System.out.println("\n===== EXCLUIR ORIENTAÇÃO ======");
        System.out.println("ID da orientação:");
        int id = Sc.lerInt();
        try {
            service.excluir(id);
            System.out.println("Excluído com sucesso!");
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
