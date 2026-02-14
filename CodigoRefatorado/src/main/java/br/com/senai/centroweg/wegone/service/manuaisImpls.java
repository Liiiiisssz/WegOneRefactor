package br.com.senai.centroweg.wegone.service;

public class manuaisImpls implements Manuais{

    private List<Manual> listaManuais;

    public ManualServico() {
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

        adicionarManual(new Manual(1, "Manual de operação de motores eletricos", textoMotor));
    }

    @Override
    public void adicionarManual(Manual manual) {
        listaManuais.add(manual);
    }

    @Override
    public List<Manual> listarTodos() {
        return new ArrayList<>(listaManuais);
    }

    @Override
    public Manual buscarPorId(int id) {
        return listaManuais.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
