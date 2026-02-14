package br.com.senai.centroweg.wegone.model;

public class Orientacoes {
    private String titulo;
    private String conteudo;
    private Categoria categoria;

    public Orientacoes(String titulo, String conteudo, Categoria categoria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
