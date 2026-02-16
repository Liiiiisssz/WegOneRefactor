package br.com.senai.centroweg.wegone.service;

import br.com.senai.centroweg.wegone.model.Categoria;
import br.com.senai.centroweg.wegone.model.Orientacoes;

import java.util.ArrayList;
import java.util.List;

public class manuaisImpls implements Manuais{

    private List<Orientacoes> listaManuais;

    public manuaisImpls() {
        this.listaManuais = new ArrayList<>();
         inicializarManuaisPadrao();
    }

    private void inicializarManuaisPadrao() {
        String textoMotor = """
                _______________________________________________________________________
                |--              MANUAL DE OPERAÇÃO DE MOTORES ELÉTRICOS            --|
                | 1. INSTRUÇÕES GERAIS: Leia o manual antes da instalação.            |
                | 2. INSTALAÇÃO: Local limpo, seco e bem ventilado.                   |
                | 3. PARTIDA: Utilize sistemas de partida adequados.                  |
                |_____________________________________________________________________|
                """;

        adicionarManual(new Orientacoes(1,"Manual de Testes", "Manual de operação de motores eletricos",Categoria.Manual_Operacoes ));
    }

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
