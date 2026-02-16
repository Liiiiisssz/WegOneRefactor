package br.com.senai.centroweg.wegone.view;

import br.com.senai.centroweg.wegone.util.Sc;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    public void exibirMenu(){
        Map<Integer, Runnable> opcoes = new HashMap<>();
        while(true){
            System.out.println("""
                 ______________________________
                | 1.  Cadastrar Orientação     |
                | 2.  Pesquisar Orientação     |
                | 3.  Editar Orientação        |
                | 4.  Excluir Orientação       |
                |------------------------------|
                | 5. X ENCERRAR PROGRAMA X     |
                |______________________________|
                """);
            int opcao = Sc.lerInt();

            opcoes.put(1, controller::cadastro);
            opcoes.put(2, controller::pesquisa);
            opcoes.put(3, controller::editar);
            opcoes.put(4, controller::excluir);
            opcoes.put(5, () -> {
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
