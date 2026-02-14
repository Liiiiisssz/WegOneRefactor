package br.com.senai.centroweg.wegone.service;

public interface Manuais {

        void adicionarManual(Manual manual);
        List<Manual> listarTodos();
        Manual buscarPorId(int id);


}
