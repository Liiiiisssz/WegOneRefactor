package br.com.senai.centroweg.wegone.repository;

import br.com.senai.centroweg.wegone.model.Orientacoes;

import java.sql.SQLException;
import java.util.List;

public interface OrientacoesRepository {

    Orientacoes cadastrar(Orientacoes orientacao) throws SQLException;

    Orientacoes pesquisar(int id) throws SQLException;

    List<Orientacoes> todas() throws SQLException;

    void editar(Orientacoes orientacao) throws SQLException;

    void excluir(int id) throws SQLException;

    boolean existe(int id) throws SQLException;
}
