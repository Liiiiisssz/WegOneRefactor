package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Orientacoes;

import java.sql.SQLException;
import java.util.List;

public interface OrientacoesService {

        Orientacoes cadastrar(Orientacoes orientacao);

        Orientacoes pesquisar(int id);

        List<Orientacoes> todas();

        Orientacoes editar(Orientacoes orientacao);

        void excluir(int id);



}
