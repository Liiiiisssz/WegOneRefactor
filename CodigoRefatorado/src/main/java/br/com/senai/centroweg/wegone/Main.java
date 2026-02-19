package br.com.senai.centroweg.wegone;

import br.com.senai.centroweg.wegone.repository.OrientacoesRepository;
import br.com.senai.centroweg.wegone.repository.OrientacoesRepositoryImpl;
import br.com.senai.centroweg.wegone.service.OrientacoesService;
import br.com.senai.centroweg.wegone.service.OrientacoesServiceImpl;
import br.com.senai.centroweg.wegone.view.Menu;
import br.com.senai.centroweg.wegone.view.MetodosCRUDImpl;

public class Main {
    public static void main(String[] args) {

        OrientacoesRepository repository = new OrientacoesRepositoryImpl();

        OrientacoesService service = new OrientacoesServiceImpl(repository);

        MetodosCRUDImpl crud = new MetodosCRUDImpl(service);

        Menu menu = new Menu(crud);

        menu.exibirMenu();
    }
}
