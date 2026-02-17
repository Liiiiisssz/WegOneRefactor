package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacoes;

import java.util.ArrayList;
import java.util.List;

public class OrientacoesServiceImpl implements OrientacoesService {

    @Override
    public void adicionarManual(Orientacoes manual) {
        listaManuais.add(manual);
    }

    @Override
    public List<Orientacoes> listarTodos() {
        return new ArrayList<>(listaManuais);
    }

    @Override
    public Orientacoes buscarPorId(int id) {
        return listaManuais.stream()
                .filter(m -> m.getId() == 1)
                .findFirst()
                .orElse(null);
    }
}
