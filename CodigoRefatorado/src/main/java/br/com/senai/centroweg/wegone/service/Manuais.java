package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Orientacoes;

import java.util.List;

public interface Manuais {

        void adicionarManual(Orientacoes manual);
        List<Orientacoes> listarTodos();
        Orientacoes buscarPorId(int id);


}
