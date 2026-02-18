package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Orientacao;

import java.util.List;

public interface OrientacoesService {

        Orientacao cadastrar(Orientacao orientacao);

        Orientacao pesquisar(int id);

        List<Orientacao> todas();

        Orientacao editar(Orientacao orientacao, int id);

        void excluir(int id);
}
