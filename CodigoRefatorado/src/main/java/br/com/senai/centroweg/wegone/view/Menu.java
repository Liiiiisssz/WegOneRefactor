package br.com.senai.centroweg.wegone.view;

import br.com.senai.centroweg.wegone.util.Sc;

public class Menu {
    public void exibirMenu(){
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
        switch (opcao){
            case 1 -> controller.cadastrar();
            case 2 -> controller.pesquisar();
            case 3 -> controller.editar();
            case 4 -> controller.excluir();
            case 5 -> System.out.println("Encerrando sistema...");
            default -> {
                System.out.println("Número inválido!");
                System.exit(0);
            }
        }
    }
}
