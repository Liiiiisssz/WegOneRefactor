package br.com.senai.centroweg.wegone.view;

import br.com.senai.centroweg.wegone.exception.BusinessException;
import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacao;
import br.com.senai.centroweg.wegone.service.OrientacoesService;
import br.com.senai.centroweg.wegone.util.Sc;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final MetodosCRUDView crud;

    public Menu(MetodosCRUDView crud) {
        this.crud = crud;
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

            opcoes.put(1, crud::cadastrar);
            opcoes.put(2, crud::pesquisar);
            opcoes.put(3, crud::todas);
            opcoes.put(4, crud::editar);
            opcoes.put(5, crud::excluir);
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
}
