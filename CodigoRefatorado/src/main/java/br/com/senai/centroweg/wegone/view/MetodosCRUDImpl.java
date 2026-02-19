package br.com.senai.centroweg.wegone.view;

import br.com.senai.centroweg.wegone.exception.BusinessException;
import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacao;
import br.com.senai.centroweg.wegone.service.OrientacoesService;
import br.com.senai.centroweg.wegone.util.Sc;

public class MetodosCRUDImpl implements MetodosCRUDView {

    private final OrientacoesService service;
    public MetodosCRUDImpl(OrientacoesService service) {
        this.service = service;
    }
    @Override
    public void cadastrar(){
        System.out.println("CADASTRAR ORIENTAÇÃO");
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
    @Override
    public void todas(){
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
    @Override
    public void pesquisar(){
        System.out.println("PESQUISAR ORIENTAÇÃO");
        System.out.println("ID da orientação:");
        int id = Sc.lerInt();
        System.out.println(service.pesquisar(id));
    }
    @Override
    public void editar(){
        System.out.println("EDITAR ORIENTAÇÃO");
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

            // Mantém valor antigo se vazio
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
    @Override
    public void excluir(){
        System.out.println("EXCLUIR ORIENTAÇÃO");
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
