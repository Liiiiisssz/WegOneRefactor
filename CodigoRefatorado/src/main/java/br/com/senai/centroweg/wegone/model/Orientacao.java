package br.com.senai.centroweg.wegone.model;

public class Orientacao {
    private int id;
    private String titulo;
    private String conteudo;
    private Categoria categoria;

    public Orientacao(String titulo, String conteudo, Categoria categoria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.categoria = categoria;
    }

    public Orientacao(int id, String titulo, String conteudo, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                "\nTítulo:\n" + titulo +
                "\nConteúdo:\n" + conteudo +
                "\nCategoria: " + categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
