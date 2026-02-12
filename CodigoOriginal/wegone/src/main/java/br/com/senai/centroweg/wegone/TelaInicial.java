package br.com.senai.centroweg.wegone;
import br.com.senai.centroweg.wegone.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaInicial {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Traducoes tradutor;

        String arquivo;

        int idioma;
        int decisaoInicial = 0;
        int tipoOrientacao;
        int tipoPesquisa;

        do {
            System.out.println("  ");

            System.out.println("--  Selecione o idioma: --");
            System.out.println("--   Select language:   --");
            System.out.println("--  Sprache auswahlen:  --");
            System.out.println("      ______________");
            System.out.println("      |            |");
            System.out.println("      | 1. pt - BR |");
            System.out.println("      | 2. en - US |");
            System.out.println("      | 3. de - DE |");
            System.out.println("      |____________|");

            while (true) {
                try {
                    idioma = leia.nextInt();  
                   
                    if (idioma >= 1 && idioma <= 3) {
                        break;  
                    } else {
                        System.out.println("Idioma inválido! Por favor, digite 1, 2 ou 3.");
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println("Entrada inválida! Por favor, digite um número.");
                    leia.nextLine();
                }
            }

            switch (idioma) {
               
                case 1:
                    arquivo = "pt.json";
                    break;

                case 2:
                    arquivo = "en.json";
                    break;

                case 3:
                    arquivo = "de.json";
                    break;

                default:
                    arquivo = "pt.json";

            }

            try {
                tradutor = new Traducoes(arquivo);

                ManualCondutaOperacoesSetoriais manualCondutaOpSet = new ManualCondutaOperacoesSetoriais(tradutor);
                ManualOperacao manualOperacao = new ManualOperacao(tradutor);
                ManutencaoReparos manutencaoReparos = new ManutencaoReparos(tradutor);
                ProcedimentoSeguranca procedimentoSeguranca = new ProcedimentoSeguranca(tradutor);
                TestesDiagnostico testesDiagnostico = new TestesDiagnostico(tradutor);

                do {
                    System.out.println(" ");
                    System.out.println("                ▄█▄▄▄█▄       ");
                    System.out.println("         ▄▀    ▄|─▄─▄─|▄    ▀▄");
                    System.out.println("         █▄▄█  ▀|─▀─▀─|▀  █▄▄█");
                    System.out.println("          ||    ▀▀███▀▀    || ");
                    System.out.println("         ████ ▄█████████▄ ████");
                    System.out.println(" ");
                    System.out.println(tradutor.get("welcome"));


                    System.out.println(" ");
                    System.out.println("  ____________________________________");
                    System.out.println(tradutor.get("menu1"));
                    System.out.println("  |----------------------------------|");
                    System.out.println(tradutor.get("menu2"));
                    System.out.println("  |----------------------------------|");
                    System.out.println(tradutor.get("menu3"));
                    System.out.println("  |----------------------------------|");
                    System.out.println(tradutor.get("menu4"));
                    System.out.println("  |----------------------------------|");
                    System.out.println(tradutor.get("menu5"));
                    System.out.println("  |----------------------------------|");
                    System.out.println(tradutor.get("menu6"));
                    System.out.println("  |__________________________________|");
                    System.out.println(" ");

                    System.out.println(tradutor.get("realizar"));
                    System.out.println(tradutor.get("resposta"));
                   
                    while (true) {
                        try {
                            decisaoInicial = leia.nextInt();  

                            if (decisaoInicial >= 1 && decisaoInicial <= 6) {
                                break;  
                            } else {
                                System.out.println(tradutor.get("invalid1a6"));
                            }

                        } catch (InputMismatchException e) {
                        
                            System.out.println(tradutor.get("entradaInvalid"));
                            leia.nextLine();
                        }
                    }

                    System.out.println(" ");

                    switch (decisaoInicial) {

                        case 1:

                            System.out.println("___________________________________________________");
                            System.out.println(tradutor.get("cadastro"));
                            System.out.println("|-------------------------------------------------|");
                            System.out.println(tradutor.get("manualOp"));
                            System.out.println("|-------------------------------------------------|");
                            System.out.println(tradutor.get("procedSeg"));
                            System.out.println("|-------------------------------------------------|");
                            System.out.println(tradutor.get("manutenRep"));
                            System.out.println("|-------------------------------------------------|");
                            System.out.println(tradutor.get("testDiag"));
                            System.out.println("|-------------------------------------------------|");
                            System.out.println(tradutor.get("manualCOS"));
                            System.out.println("|_________________________________________________|");
                            System.out.println(tradutor.get("return"));
                            System.out.println("|_________________________________________________|");
                            System.out.println(" ");

                            System.out.println(tradutor.get("chooseCad"));
                            System.out.println(tradutor.get("resposta"));
                           
                             while (true) {
                                try {
                                    tipoOrientacao = leia.nextInt();  
                                
                                    if (tipoOrientacao >= 1 && tipoOrientacao <= 6) {
                                        break;  
                                    } else {
                                        System.out.println(tradutor.get("invalid1a6"));
                                    }

                                } catch (InputMismatchException e) {
                                
                                    System.out.println(tradutor.get("entradaInvalid"));
                                    leia.nextLine();
                                }
                            }

                            if(arquivo.equals("pt.json")){ //cadastro PT

                                switch (tipoOrientacao) {

                                    case 1: //manualOperação
                                        System.out.println(" ");
                                        manualOperacao.cadastrarManual();
                                        break;

                                    case 2: //procedimentoSeguranca
                                        System.out.println(" ");
                                        procedimentoSeguranca.cadastrarManual();
                                        break;

                                    case 3: //manutencaoReparos
                                        System.out.println(" ");
                                        manutencaoReparos.cadastrarManual();
                                        break;

                                    case 4: //testesDiagnostico
                                        System.out.println(" ");
                                        testesDiagnostico.cadastrarManual();
                                        break;

                                    case 5: //manualCondutaOperacoesSetoriais
                                        System.out.println(" ");
                                        manualCondutaOpSet.cadastrarManual();
                                        break;

                                    case 6: //VoltarInicio
                                        System.out.println(" ");
                                        break;

                                    default:
                                        System.out.println(" ");
                                        System.out.println(tradutor.get("invalid"));
                                        break;
                                }

                            } else if (arquivo.equals("en.json")){ //cadastro INGLES

                                switch (tipoOrientacao) {

                                    case 1: //manualOperação
                                        System.out.println(" ");
                                        manualOperacao.cadastrarManualEN();
                                        break;

                                    case 2: //procedimentoSeguranca
                                        System.out.println(" ");
                                        procedimentoSeguranca.cadastrarManualEN();
                                        break;

                                    case 3: //manutencaoReparos
                                        System.out.println(" ");
                                        manutencaoReparos.cadastrarManualEN();
                                        break;

                                    case 4: //testesDiagnostico
                                        System.out.println(" ");
                                        testesDiagnostico.cadastrarManualEN();
                                        break;

                                    case 5: //manualCondutaOperacoesSetoriais
                                        System.out.println(" ");
                                        manualCondutaOpSet.cadastrarManualEN();
                                        break;

                                    case 6: //VoltarInicio
                                        System.out.println(" ");
                                        break;

                                    default:
                                        System.out.println(" ");
                                        System.out.println(tradutor.get("invalid"));
                                        break;
                                }

                            } else if (arquivo.equals("de.json")){ //cadastro ALEMÃO

                                switch (tipoOrientacao) {

                                    case 1: //manualOperação
                                        System.out.println(" ");
                                        manualOperacao.cadastrarManualDE();
                                        break;

                                    case 2: //procedimentoSeguranca
                                        System.out.println(" ");
                                        procedimentoSeguranca.cadastrarManualDE();
                                        break;

                                    case 3: //manutencaoReparos
                                        System.out.println(" ");
                                        manutencaoReparos.cadastrarManualDE();
                                        break;

                                    case 4: //testesDiagnostico
                                        System.out.println(" ");
                                        testesDiagnostico.cadastrarManualDE();
                                        break;

                                    case 5: //manualCondutaOperacoesSetoriais
                                        System.out.println(" ");
                                        manualCondutaOpSet.cadastrarManualDE();
                                        break;

                                    case 6: //VoltarInicio
                                        System.out.println(" ");
                                        break;

                                    default:
                                        System.out.println(" ");
                                        System.out.println(tradutor.get("invalid"));
                                        break;
                                }

                            }
                           
                    break;

                    case 2: //pesquisa
                        System.out.println("___________________________________________________");
                        System.out.println(tradutor.get("pesquisa"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualOp"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("procedSeg"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manutenRep"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("testDiag"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualCOS"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(tradutor.get("return"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(" ");

                        System.out.println(tradutor.get("choosePesq"));
                        System.out.println(tradutor.get("resposta"));
                       
                         while (true) {
                            try {
                                tipoOrientacao = leia.nextInt();  
                   
                                if (tipoOrientacao >= 1 && tipoOrientacao <= 6) {
                                    break; 

                                } else {
                                    System.out.println(tradutor.get("invalid1a6"));
                                }

                            } catch (InputMismatchException e) {
                   
                                    System.out.println(tradutor.get("entradaInvalid"));
                                    leia.nextLine();
                            }
                        }

                        switch(tipoOrientacao){
                           
                            case 1: //manualOperacao
                                System.out.println("___________________________________________________");
                                System.out.println(tradutor.get("pesqManualOp"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqTitulo"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqCodigo"));
                                System.out.println("|_________________________________________________|");
                            
                                System.out.println(" ");
                                System.out.println(tradutor.get("chooseTipoPesq"));
                                System.out.println(tradutor.get("resposta"));
                               
                                 while (true) {
                                    try {
                                        tipoPesquisa = leia.nextInt();  
                                    
                                        if (tipoPesquisa >= 1 && tipoPesquisa <= 2) {
                                            break;  
                                        } else {
                                            System.out.println(tradutor.get("invalid1a2"));
                                        }

                                    } catch (InputMismatchException e) {
                                    
                                        System.out.println(tradutor.get("entradaInvalid"));
                                        leia.nextLine();
                                    }
                                }
                   
                                if(arquivo.equals("pt.json")){ //PT

                                    switch(tipoPesquisa){
                   
                                    case 1:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualTitulo();
                                        break;
                   
                                    case 2:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualCodigo();
                                        break;
                   
                                    }

                                } else if (arquivo.equals("en.json")){ //INGLES

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manualOperacao.pesquisaManualTituloEN();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manualOperacao.pesquisaManualCodigoEN();
                                            break;
                       
                                    }

                                } else if (arquivo.equals("de.json")){ //ALEMÃO


                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manualOperacao.pesquisaManualTituloDE();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manualOperacao.pesquisaManualCodigoDE();
                                            break;
                       
                                    }

                                }
                               
                                break;

                            case 2: //procedimentoSeguranca
                                System.out.println("___________________________________________________");
                                System.out.println(tradutor.get("pesqProcedSeg"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqTitulo"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqCodigo"));
                                System.out.println("|_________________________________________________|");
                            
                                System.out.println(" ");
                                System.out.println(tradutor.get("chooseTipoPesq"));
                                System.out.println(tradutor.get("resposta"));
                               
                                 while (true) {
                                    try {
                                        tipoPesquisa = leia.nextInt();  

                                        if (tipoPesquisa >= 1 && tipoPesquisa <= 2) {
                                            break;  
                                        } else {
                                            System.out.println(tradutor.get("invalid1a2"));
                                        }

                                    } catch (InputMismatchException e) {
                                    
                                        System.out.println(tradutor.get("entradaInvalid"));
                                        leia.nextLine();
                                    }
                                }
                   
                                if(arquivo.equals("pt.json")){ //pesquisa PT

                                    switch(tipoPesquisa){
                   
                                    case 1:
                                        System.out.println(" ");
                                        procedimentoSeguranca.pesquisarManualTitulo();
                                        break;
                   
                                    case 2:
                                        System.out.println(" ");
                                        procedimentoSeguranca.pesquisaManualCodigo();
                                        break;
                   
                                    }

                                } else if(arquivo.equals("en.json")){ //pesquisa INGLES

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            procedimentoSeguranca.pesquisarManualTituloEN();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            procedimentoSeguranca.pesquisaManualCodigoEN();
                                            break;
                       
                                    }

                                } else if(arquivo.equals("de.json")){ //pesquisa ALEMAO
                               
                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            procedimentoSeguranca.pesquisarManualTituloDE();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            procedimentoSeguranca.pesquisaManualCodigoDE();
                                            break;
                       
                                    }
                                }
                               
                                break;

                            case 3: //manutencaoReparos
                                System.out.println("___________________________________________________");
                                System.out.println(tradutor.get("pesqManutenRep"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqTitulo"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqCodigo"));
                                System.out.println("|_________________________________________________|");
                            
                                System.out.println(" ");
                                System.out.println(tradutor.get("chooseTipoPesq"));
                                System.out.println(tradutor.get("resposta"));
                               
                                while (true) {
                                    try {
                                    tipoPesquisa = leia.nextInt();  
                            
                                        if (tipoPesquisa >= 1 && tipoPesquisa <= 2) {
                                            break;  
                                        } else {
                                            System.out.println(tradutor.get("invalid1a2"));
                                        }

                                    } catch (InputMismatchException e) {
                                        System.out.println(tradutor.get("entradaInvalid"));
                                        leia.nextLine();
                                    }
                                }
  
                                if(arquivo.equals("pt.json")){ //pesquisa PT

                                    switch(tipoPesquisa){
                   
                                    case 1:
                                        System.out.println(" ");
                                        manutencaoReparos.pesquisaManualTitulo();
                                        break;
                   
                                    case 2:
                                        System.out.println(" ");
                                        manutencaoReparos.pesquisaManualCodigo();
                                        break;
                   
                                    }

                                } else if (arquivo.equals("en.json")){ //pesquisa INGLES

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manutencaoReparos.pesquisaManualTituloEN();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manutencaoReparos.pesquisaManualCodigoEN();
                                            break;
                       
                                    }

                                } else if (arquivo.equals("de.json")){ //pesquisa ALEMÃO

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manutencaoReparos.pesquisaManualTituloDE();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manutencaoReparos.pesquisaManualCodigoDE();
                                            break;
                       
                                    }
                                }
                               
                                break;

                            case 4: //testesDiagnostico
                                System.out.println("__________________________________________________");
                                System.out.println(tradutor.get("pesqTestDiag"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqTitulo"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqCodigo"));
                                System.out.println("|_________________________________________________|");
                            
                                System.out.println(" ");
                                System.out.println(tradutor.get("chooseTipoPesq"));
                                System.out.println(tradutor.get("resposta"));
                               
                                while (true) {
                                    try {
                                        tipoPesquisa = leia.nextInt();  
                                    
                                        if (tipoPesquisa >= 1 && tipoPesquisa <= 2) {
                                            break;  
                                        } else {
                                            System.out.println(tradutor.get("invalid1a2"));
                                        }

                                    } catch (InputMismatchException e) {
                                    
                                        System.out.println(tradutor.get("entradaInvalid"));
                                        leia.nextLine();
                                    }
                                }
                   
                                if(arquivo.equals("pt.json")){ //pesquisa PT

                                    switch(tipoPesquisa){
                   
                                    case 1:
                                        System.out.println(" ");
                                        testesDiagnostico.pesquisarManualTitulo();
                                        break;
                   
                                    case 2:
                                        System.out.println(" ");
                                        testesDiagnostico.pesquisaManualCodigo();
                                        break;
                   
                                    }

                                } else if(arquivo.equals("en.json")){ //pesquisa INGLES

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            testesDiagnostico.pesquisarManualTituloEN();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            testesDiagnostico.pesquisaManualCodigoEN();
                                            break;
                       
                                    }

                                } else if(arquivo.equals("de.json")){ //pesquisa ALEMAO

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            testesDiagnostico.pesquisarManualTituloDE();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            testesDiagnostico.pesquisaManualCodigoDE();
                                            break;
                       
                                        }
                                }
                               
                                break;

                            case 5: //manualCondutaOperacoesSetoriais
                                System.out.println("__________________________________________________");
                                System.out.println(tradutor.get("pesqManualCOS1"));
                                System.out.println(tradutor.get("pesqManualCOS2"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqTitulo"));
                                System.out.println("|-------------------------------------------------|");
                                System.out.println(tradutor.get("pesqCodigo"));
                                System.out.println("|_________________________________________________|");
                            
                                System.out.println(" ");
                                System.out.println(tradutor.get("chooseTipoPesq"));
                                System.out.println(tradutor.get("resposta"));
                               
                                while (true) {
                                    try {
                                        tipoPesquisa = leia.nextInt();  
                                    
                                        if (tipoPesquisa >= 1 && tipoPesquisa <= 2) {
                                            break;  
                                        } else {
                                            System.out.println(tradutor.get("invalid1a2"));
                                        }

                                    } catch (InputMismatchException e) {
                                    
                                        System.out.println(tradutor.get("entradaInvalid"));
                                        leia.nextLine();
                                    }
                                }
                               
                                if(arquivo.equals("pt.json")){ //PT

                                    switch(tipoPesquisa){
                   
                                    case 1:
                                        System.out.println(" ");
                                        manualCondutaOpSet.pesquisaManualTitulo();
                                        break;
                   
                                    case 2:
                                        System.out.println(" ");
                                        manualCondutaOpSet.pesquisaManualCodigo();
                                        break;
                   
                                    }

                                } else if (arquivo.equals("en.json")){ //INGLES

                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manualCondutaOpSet.pesquisaManualTituloEN();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manualCondutaOpSet.pesquisaManualCodigoEN();
                                            break;
                       
                                    }

                                } else if (arquivo.equals("de.json")){ //ALEMÃO
                               
                                    switch(tipoPesquisa){
                   
                                        case 1:
                                            System.out.println(" ");
                                            manualCondutaOpSet.pesquisaManualTituloDE();
                                            break;
                       
                                        case 2:
                                            System.out.println(" ");
                                            manualCondutaOpSet.pesquisaManualCodigoDE();
                                            break;
                       
                                    }
                                }
                            
                                break;

                            case 6: //VoltarInicio
                                System.out.println(" ");
                                break;

                            default://NenhumaOpçãoAcima
                                System.out.println(tradutor.get("invalid"));
                                break;
                        }

                        break;
                           
                    case 3: //editar
                        System.out.println("___________________________________________________");
                        System.out.println(tradutor.get("edicao"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualOp"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("procedSeg"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manutenRep"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("testDiag"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualCOS"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(tradutor.get("return"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(" ");

                        System.out.println(tradutor.get("chooseEdit"));
                        System.out.print(tradutor.get("resposta"));
                       
                        while (true) {
                            try {
                                tipoOrientacao = leia.nextInt();  

                                if (tipoOrientacao >= 1 && tipoOrientacao <= 6) {
                                    break;  
                                } else {
                                    System.out.println(tradutor.get("invalid1a6"));
                                }

                            } catch (InputMismatchException e) {
                            
                                System.out.println(tradutor.get("entradaInvalid"));
                                leia.nextLine();
                            }
                        }

                        if(arquivo.equals("pt.json")){ //editar em PT

                            switch(tipoOrientacao){

                            case 1: //manualOperacao
                                System.out.println(" ");
                                manualOperacao.editarManual();
                                break;
                           
                            case 2: //procedimentoSeguranca
                                System.out.println(" ");
                                procedimentoSeguranca.editarManual();
                                break;

                            case 3: //manutencaoReparos
                                System.out.println(" ");
                                manutencaoReparos.editarManual();
                                break;

                            case 4: //testesDiagnostico
                                System.out.println(" ");
                                testesDiagnostico.editarManual();
                                break;

                            case 5: //manualCondutaOperacoesSetoriais
                                System.out.println(" ");
                                manualCondutaOpSet.editarManual();
                                break;
                           
                            case 6: //VoltarInicio
                                System.out.println(" ");
                                break;

                            default://NenhumaOpçãoAcima
                                System.out.println(tradutor.get("invalid"));
                                break;

                            }

                        } else if (arquivo.equals("en.json")){ //editar em INGLES

                            switch(tipoOrientacao){

                                case 1: //manualOperacao
                                    System.out.println(" ");
                                    manualOperacao.editarManualEN();
                                    break;
                               
                                case 2: //procedimentoSeguranca
                                    System.out.println(" ");
                                    procedimentoSeguranca.editarManualEN();
                                    break;
       
                                case 3: //manutencaoReparos
                                    System.out.println(" ");
                                    manutencaoReparos.editarManualEN();
                                    break;
       
                                case 4: //testesDiagnostico
                                    System.out.println(" ");
                                    testesDiagnostico.editarManualEN();
                                    break;
       
                                case 5: //manualCondutaOperacoesSetoriais
                                    System.out.println(" ");
                                    manualCondutaOpSet.editarManualEN();
                                    break;
                               
                                case 6: //VoltarInicio
                                    System.out.println(" ");
                                    break;
       
                                default://NenhumaOpçãoAcima
                                    System.out.println(tradutor.get("invalid"));
                                    break;
       
                            }

                        } else if (arquivo.equals("de.json")){ //editar em ALEMÃO

                            switch(tipoOrientacao){

                                case 1: //manualOperacao
                                    System.out.println(" ");
                                    manualOperacao.editarManualDE();
                                    break;
                               
                                case 2: //procedimentoSeguranca
                                    System.out.println(" ");
                                    procedimentoSeguranca.editarManualDE();
                                    break;
       
                                case 3: //manutencaoReparos
                                    System.out.println(" ");
                                    manutencaoReparos.editarManualDE();
                                    break;
       
                                case 4: //testesDiagnostico
                                    System.out.println(" ");
                                    testesDiagnostico.editarManualDE();
                                    break;
       
                                case 5: //manualCondutaOperacoesSetoriais
                                    System.out.println(" ");
                                    manualCondutaOpSet.editarManualDE();
                                    break;
                               
                                case 6: //VoltarInicio
                                    System.out.println(" ");
                                    break;
       
                                default://NenhumaOpçãoAcima
                                    System.out.println(tradutor.get("invalid"));
                                    break;
       
                                }
                        }

                        break;
                   
                    case 4: //excluir
                        System.out.println("___________________________________________________");
                        System.out.println(tradutor.get("exclusao"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualOp"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("procedSeg"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manutenRep"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("testDiag"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualCOS"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(tradutor.get("return"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(" ");

                        System.out.println(tradutor.get("chooseExcluir"));
                        System.out.print(tradutor.get("resposta"));
                       
                        while (true) {
                            try {
                                tipoOrientacao = leia.nextInt();  
                            
                                if (tipoOrientacao >= 1 && tipoOrientacao <= 6) {
                                    break;  
                                } else {
                                    System.out.println(tradutor.get("invalid1a6"));
                                }

                            } catch (InputMismatchException e) {
                            
                                System.out.println(tradutor.get("entradaInvalid"));
                                leia.nextLine();
                            }
                        }

                        if(arquivo.equals("pt.json")){ //PT

                            switch(tipoOrientacao){

                            case 1: //manualOperacao
                                System.out.println(" ");
                                manualOperacao.excluirManual();
                                break;
                           
                            case 2: //procedimentoSeguranca
                                System.out.println(" ");
                                procedimentoSeguranca.excluirManual();
                                break;

                            case 3: //manutencaoReparos
                                System.out.println(" ");
                                manutencaoReparos.excluirManual();
                                break;

                            case 4: //testesDiagnostico
                                System.out.println(" ");
                                testesDiagnostico.excluirManual();
                                break;

                            case 5: //manualCondutaOperacoesSetoriais
                                System.out.println(" ");
                                manualCondutaOpSet.excluirManual();
                                break;

                            case 6: //VoltarInicio
                                System.out.println(" ");
                                break;

                            default://NenhumaOpçãoAcima
                                System.out.println(tradutor.get("invalid"));
                                break;

                            }

                        } else if(arquivo.equals("en.json")){ //INGLES

                            switch(tipoOrientacao){

                                case 1: //manualOperacao
                                    System.out.println(" ");
                                    manualOperacao.excluirManualEN();
                                    break;
                               
                                case 2: //procedimentoSeguranca
                                    System.out.println(" ");
                                    procedimentoSeguranca.excluirManualEN();
                                    break;
       
                                case 3: //manutencaoReparos
                                    System.out.println(" ");
                                    manutencaoReparos.excluirManualEN();
                                    break;
       
                                case 4: //testesDiagnostico
                                    System.out.println(" ");
                                    testesDiagnostico.excluirManualEN();
                                    break;
       
                                case 5: //manualCondutaOperacoesSetoriais
                                    System.out.println(" ");
                                    manualCondutaOpSet.excluirManualEN();
                                    break;
       
                                case 6: //VoltarInicio
                                    System.out.println(" ");
                                    break;
       
                                default://NenhumaOpçãoAcima
                                    System.out.println(tradutor.get("invalid"));
                                    break;
       
                            }

                        } else if(arquivo.equals("de.json")){ //ALEMAO

                            switch(tipoOrientacao){

                                case 1: //manualOperacao
                                    System.out.println(" ");
                                    manualOperacao.excluirManualDE();
                                    break;
                               
                                case 2: //procedimentoSeguranca
                                    System.out.println(" ");
                                    procedimentoSeguranca.excluirManualDE();
                                    break;
       
                                case 3: //manutencaoReparos
                                    System.out.println(" ");
                                    manutencaoReparos.excluirManualDE();
                                    break;
       
                                case 4: //testesDiagnostico
                                    System.out.println(" ");
                                    testesDiagnostico.excluirManualDE();
                                    break;
       
                                case 5: //manualCondutaOperacoesSetoriais
                                    System.out.println(" ");
                                    manualCondutaOpSet.excluirManualDE();
                                    break;
       
                                case 6: //VoltarInicio
                                    System.out.println(" ");
                                    break;
       
                                default://NenhumaOpçãoAcima
                                    System.out.println(tradutor.get("invalid"));
                                    break;
       
                                }
                        }
                       
                        break;

                    case 5: //encerrar
                        System.out.println(tradutor.get("encerrar"));
                        break;

                    case 6: //mudando idioma
                        System.out.println(" ");
                        break;

                    default: //nenhuma das opções
                        System.out.println(tradutor.get("invalid"));
                        break;

                    }

                } while(decisaoInicial != 5 && decisaoInicial != 6);

            } catch (IOException e) {

                System.out.println("Erro ao carregar tradução!");

            }
           
        } while(decisaoInicial == 6);

        leia.close();    
    }
}

