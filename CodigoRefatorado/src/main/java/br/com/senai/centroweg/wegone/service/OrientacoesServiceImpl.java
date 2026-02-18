package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.exception.BusinessException;
import br.com.senai.centroweg.wegone.model.Orientacao;
import br.com.senai.centroweg.wegone.repository.OrientacoesRepository;

import java.util.List;

public class OrientacoesServiceImpl implements OrientacoesService {
    private  final OrientacoesRepository repository;

    public OrientacoesServiceImpl(OrientacoesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Orientacao cadastrar(Orientacao orientacao) {
        return repository.cadastrar(orientacao) ;
    }

    @Override
    public Orientacao pesquisar(int id) {
        return repository.pesquisar(id)
                .orElseThrow(() -> new BusinessException("Orientação não encontrada"));
    }

    @Override
    public List<Orientacao> todas() {
        return repository.todas();
    }

    @Override
    public Orientacao editar(Orientacao orientacao, int id) {
        orientacao.setId(id);
        repository.editar(orientacao);
        return orientacao;
    }

    @Override
    public void excluir(int id) {
        repository.excluir(id);
    }
}
