package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacoes;
import br.com.senai.centroweg.wegone.repository.OrientacoesRepository;
import br.com.senai.centroweg.wegone.repository.OrientacoesRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class OrientacoesServiceImpl implements OrientacoesService {
    private  final OrientacoesRepositoryImpl repository;

    public OrientacoesServiceImpl(OrientacoesRepositoryImpl repository) {
        this.repository = repository;
    }


    @Override
    public Orientacoes cadastrar(Orientacoes orientacao) {
        return repository.cadastrar(orientacao) ;
    }

    @Override
    public Orientacoes pesquisar(int id) {
        return repository.pesquisar(id);
    }

    @Override
    public List<Orientacoes> todas() {
        return repository.todas();
    }

    @Override
    public Orientacoes editar(Orientacoes orientacao, int id) {
        orientacao.setId(id);
        repository.editar(orientacao);
        return orientacao;
    }

    @Override
    public void excluir(int id) {
        if(!repository.existe(id)){
            throw new RuntimeException("O Id não coresponde a nenhum produto");
        }
        repository.excluir(id);
    }


}
