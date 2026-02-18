package br.com.senai.centroweg.wegone.repository;

import br.com.senai.centroweg.wegone.model.Orientacao;

import java.util.List;
import java.util.Optional;

public interface OrientacoesRepository {

    Orientacao cadastrar(Orientacao orientacao);

    Optional<Orientacao> pesquisar(int id);

    List<Orientacao> todas();

    void editar(Orientacao orientacao);

    void excluir(int id);
}
