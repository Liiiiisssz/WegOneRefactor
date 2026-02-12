package br.com.senai.centroweg.wegone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcedimentoSeguranca {

    Scanner leia = new Scanner(System.in);

    Traducoes tradutor;

    String[] procedimentoSeguranca = new String[4];
	String[] titulosProcedimentoSeguranca = new String[4];

    String[] procedimentoSegurancaEN = new String[4];
	String[] titulosProcedimentoSegurancaEN = new String[4];

    String[] procedimentoSegurancaDE = new String[4];
	String[] titulosProcedimentoSegurancaDE = new String[4];

    int contadorCadastro = 2;
    int contadorCadastroEN = 2;
    int contadorCadastroDE = 2;
    int pesquisaCodigo;
	int indiceCadastro;
	int codigo;

    public ProcedimentoSeguranca(Traducoes tradutor) {

        this.tradutor = tradutor;

        //manuais em PT
        titulosProcedimentoSeguranca[0] = "Manual de seguranca motor weg W22";

        procedimentoSeguranca[0] = 
                                "________________________________________________________________________\n" +
                                "|--               MANUAL DE SEGURANÇA - MOTOR WEG W22                 --|\n" +
                                "|_______________________________________________________________________|\n" +
                                "|-- OBJETIVO: Procedimento seguro para inspeção e manutenção do motor --|\n" +
                                "|   WEG W22, garantindo a integridade do operador e do equipamento.     |\n" +
                                "|_______________________________________________________________________|\n" +
                                "|                                                                      |\n" +
                                "| 1. INSTRUÇÕES GERAIS:                                                |\n" +
                                "|                                                                      |\n" +
                                "| - Somente técnicos qualificados podem intervir no equipamento.       |\n" +
                                "| - Leia atentamente o manual do fabricante antes de qualquer ação.    |\n" +
                                "| - Nunca opere o motor sem as proteções instaladas.                   |\n" +
                                "|                                                                      |\n" +
                                "|----------------------------------------------------------------------|\n" +
                                "|                                                                      |\n" +
                                "| 2. DESLIGAMENTO SEGURO:                                              |\n" +
                                "|                                                                      |\n" +
                                "| - Desligue a alimentação principal do quadro de energia.             |\n" +
                                "| - Aplique bloqueio e etiquetagem (LOTO).                             |\n" +
                                "| - Aguarde 10 minutos para descarregar capacitores.                   |\n" +
                                "| - Verifique ausência de tensão com detector CAT III/IV.              |\n" +
                                "|                                                                      |\n" +
                                "|----------------------------------------------------------------------|\n" +
                                "|                                                                      |\n" +
                                "| 3. EPI OBRIGATÓRIO:                                                  |\n" +
                                "|                                                                      |\n" +
                                "| - Luvas isolantes                                                    |\n" +
                                "| - Óculos de proteção                                                 |\n" +
                                "| - Calçado de segurança dielétrico                                    |\n" +
                                "| - Detector de tensão                                                 |\n" +
                                "| - Capacete com viseira                                               |\n" +
                                "|                                                                      |\n" +
                                "|----------------------------------------------------------------------|\n" +
                                "|                                                                      |\n" +
                                "| 4. INSPEÇÃO:                                                         |\n" +
                                "|                                                                      |\n" +
                                "| - Verificar temperatura, vibração e ruídos.                          |\n" +
                                "| - Inspecionar bornes, carcaça e ventilação.                          |\n" +
                                "| - Limpar com materiais não inflamáveis.                              |\n" +
                                "|                                                                      |\n" +
                                "|----------------------------------------------------------------------|\n" +
                                "|                                                                      |\n" +
                                "| 5. NORMAS APLICADAS:                                                 |\n" +
                                "|                                                                      |\n" +
                                "| - NR-10, NR-12                                                       |\n" +
                                "| - NBR IEC 60034-1                                                    |\n" +
                                "| - Manual Técnico WEG W22                                             |\n" +
                                "|                                                                      |\n" +
                                "|______________________________________________________________________|\n";

        titulosProcedimentoSeguranca[1] = "Manual de seguranca inversor weg CFW500";

        procedimentoSeguranca[1] = 
                                "_______________________________________________________________________\n" +
                                "|--          MANUAL DE SEGURANÇA - INVERSOR WEG CFW500              --|\n" +
                                "|_____________________________________________________________________|\n" +
                                "|-- OBJETIVO: Garantir a segurança na parametrização e manutenção   --|\n" +
                                "|   do inversor de frequência WEG CFW500, evitando acidentes.         |\n" +
                                "|_____________________________________________________________________|\n" +
                                "|                                                                     |\n" +
                                "| 1. INSTRUÇÕES GERAIS:                                               |\n" +
                                "|                                                                     |\n" +
                                "| - Leia o manual do inversor antes de qualquer procedimento.         |\n" +
                                "| - Apenas profissionais habilitados devem operar o equipamento.      |\n" +
                                "| - Nunca toque na placa eletrônica com tensão presente.              |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 2. DESLIGAMENTO E PREPARAÇÃO:                                       |\n" +
                                "|                                                                     |\n" +
                                "| - Desligar o disjuntor de entrada do painel elétrico.               |\n" +
                                "| - Aplicar bloqueio e etiquetagem (LOTO).                            |\n" +
                                "| - Aguardar 15 minutos após desligamento.                            |\n" +
                                "| - Confirmar ausência de tensão nos terminais R/S/T e U/V/W.         |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 3. EPI OBRIGATÓRIO:                                                 |\n" +
                                "|                                                                     |\n" +
                                "| - Luvas e ferramentas isoladas (1000V)                              |\n" +
                                "| - Óculos de proteção                                                |\n" +
                                "| - Calçado de segurança                                              |\n" +
                                "| - Detector de tensão                                                |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 4. PARAMETRIZAÇÃO SEGURA:                                           |\n" +
                                "|                                                                     |\n" +
                                "| - Utilizar HMI do inversor ou software WEG com cabo isolado.        |\n" +
                                "| - Verificar se a carga está desconectada durante os ajustes.        |\n" +
                                "| - Validar parâmetros antes de reenergizar o sistema.                |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 5. NORMAS APLICADAS:                                                |\n" +
                                "|                                                                     |\n" +
                                "| - NR-10                                                             |\n" +
                                "| - NBR IEC 61800-5-1                                                 |\n" +
                                "| - Manual Técnico CFW500 WEG                                         |\n" +
                                "|                                                                     |\n" +
                                "|_____________________________________________________________________|\n";


        //manuais em INGLES
        titulosProcedimentoSegurancaEN[0] = "Safety Manual WEG W22 Motor";

        procedimentoSegurancaEN[0] = 
                "_______________________________________________________________________\n" +
                "|--               SAFETY MANUAL - WEG W22 MOTOR                     --|\n" +
                "|_____________________________________________________________________|\n" +
                "|-- PURPOSE: Safe procedure for inspection and maintenance of the   --|\n" +
                "|   WEG W22 motor, ensuring operator and equipment safety.            |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. GENERAL INSTRUCTIONS:                                            |\n" +
                "|                                                                     |\n" +
                "| - Only qualified technicians may work on the equipment.             |\n" +
                "| - Carefully read the manufacturer's manual before any action.       |\n" +
                "| - Never operate the motor without the protections installed.        |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. SAFE SHUTDOWN:                                                   |\n" +
                "|                                                                     |\n" +
                "| - Turn off the main power supply from the control panel.            |\n" +
                "| - Apply lockout and tagout (LOTO).                                  |\n" +
                "| - Wait 10 minutes to discharge capacitors.                          |\n" +
                "| - Verify absence of voltage with CAT III/IV tester.                 |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. REQUIRED PPE:                                                    |\n" +
                "|                                                                     |\n" +
                "| - Insulating gloves                                                 |\n" +
                "| - Safety goggles                                                    |\n" +
                "| - Dielectric safety footwear                                        |\n" +
                "| - Voltage detector                                                  |\n" +
                "| - Helmet with visor                                                 |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. INSPECTION:                                                      |\n" +
                "|                                                                     |\n" +
                "| - Check temperature, vibration, and noise.                          |\n" +
                "| - Inspect terminals, housing, and ventilation.                      |\n" +
                "| - Clean with non-flammable materials.                               |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. APPLICABLE STANDARDS:                                            |\n" +
                "|                                                                     |\n" +
                "| - NR-10, NR-12                                                      |\n" +
                "| - NBR IEC 60034-1                                                   |\n" +
                "| - WEG W22 Technical Manual                                          |\n" +
                "|                                                                     |\n" +
                "|_____________________________________________________________________|\n";

                titulosProcedimentoSegurancaEN[1] = "Safety Manual WEG CFW500 Inverter";

                procedimentoSegurancaEN[1] = 
                        "_______________________________________________________________________\n" +
                        "|--            SAFETY MANUAL - WEG CFW500 INVERTER                  --|\n" +
                        "|_____________________________________________________________________|\n" +
                        "|-- PURPOSE: Ensure safety during parameter setting and maintenance --|\n" +
                        "|   of the WEG CFW500 frequency inverter, avoiding accidents.         |\n" +
                        "|_____________________________________________________________________|\n" +
                        "|                                                                     |\n" +
                        "| 1. GENERAL INSTRUCTIONS:                                            |\n" +
                        "|                                                                     |\n" +
                        "| - Read the inverter manual before any procedure.                    |\n" +
                        "| - Only qualified professionals should operate the equipment.        |\n" +
                        "| - Never touch the electronic board while energized.                 |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 2. POWER-OFF AND PREPARATION:                                       |\n" +
                        "|                                                                     |\n" +
                        "| - Turn off the breaker on the electrical panel.                     |\n" +
                        "| - Apply lockout and tagout (LOTO).                                  |\n" +
                        "| - Wait 15 minutes after shutdown.                                   |\n" +
                        "| - Confirm absence of voltage on terminals R/S/T and U/V/W.          |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 3. REQUIRED PPE:                                                    |\n" +
                        "|                                                                     |\n" +
                        "| - Insulated gloves and tools (1000V)                                |\n" +
                        "| - Safety goggles                                                    |\n" +
                        "| - Safety shoes                                                      |\n" +
                        "| - Voltage detector                                                  |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 4. SAFE PARAMETER SETTING:                                          |\n" +
                        "|                                                                     |\n" +
                        "| - Use inverter HMI or WEG software with insulated cable.            |\n" +
                        "| - Ensure the load is disconnected during adjustments.               |\n" +
                        "| - Validate parameters before re-energizing the system.              |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 5. APPLICABLE STANDARDS:                                            |\n" +
                        "|                                                                     |\n" +
                        "| - NR-10                                                             |\n" +
                        "| - NBR IEC 61800-5-1                                                 |\n" +
                        "| - WEG CFW500 Technical Manual                                       |\n" +
                        "|                                                                     |\n" +
                        "|_____________________________________________________________________|\n";

        
        //manuais em ALEMÃO
        titulosProcedimentoSegurancaDE[0] = "Sicherheitsanleitung WEG W22 Motor";

        procedimentoSegurancaDE[0] = 
                "_______________________________________________________________________\n" +
                "|--               SICHERHEITSANLEITUNG - WEG W22 MOTOR              --|\n" +
                "|_____________________________________________________________________|\n" +
                "|-- ZIEL: Sicheres Verfahren zur Inspektion und Wartung des Motors  --|\n" +
                "|   WEG W22, um die Sicherheit des Bedieners und des Geräts zu        |\n" +
                "|   gewährleisten.                                                    |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. ALLGEMEINE ANWEISUNGEN:                                          |\n" +
                "|                                                                     |\n" +
                "| - Nur qualifiziertes Personal darf am Gerät arbeiten.               |\n" +
                "| - Lesen Sie vor jeglicher Maßnahme sorgfältig das Handbuch des      |\n" +
                "|   Herstellers.                                                      |\n" +
                "| - Der Motor darf niemals ohne installierte Schutzvorrichtungen      |\n" +
                "|   betrieben werden.                                                 |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. SICHERE ABSCHALTUNG:                                             |\n" +
                "|                                                                     |\n" +
                "| - Hauptstromversorgung im Schaltschrank ausschalten.                |\n" +
                "| - Verriegelung und Kennzeichnung (LOTO) anwenden.                   |\n" +
                "| - 10 Minuten warten, um Kondensatoren zu entladen.                  |\n" +
                "| - Spannungsfreiheit mit einem CAT III/IV-Spannungsprüfer prüfen.    |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. ERFORDERLICHE PSA:                                               |\n" +
                "|                                                                     |\n" +
                "| - Isolierhandschuhe                                                 |\n" +
                "| - Schutzbrille                                                      |\n" +
                "| - Dielektrische Sicherheitsschuhe                                   |\n" +
                "| - Spannungsprüfer                                                   |\n" +
                "| - Schutzhelm mit Visier                                             |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. INSPEKTION:                                                      |\n" +
                "|                                                                     |\n" +
                "| - Temperatur, Vibrationen und Geräusche überprüfen.                 |\n" +
                "| - Klemmen, Gehäuse und Belüftung kontrollieren.                     |\n" +
                "| - Mit nicht brennbaren Materialien reinigen.                        |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. ANWENDBARE NORMEN:                                               |\n" +
                "|                                                                     |\n" +
                "| - NR-10, NR-12                                                      |\n" +
                "| - NBR IEC 60034-1                                                   |\n" +
                "| - Technisches Handbuch WEG W22                                      |\n" +
                "|                                                                     |\n" +
                "|_____________________________________________________________________|\n";

    titulosProcedimentoSegurancaDE[1] = "Sicherheitsanleitung WEG CFW500 Frequenzumrichter";

    procedimentoSegurancaDE[1] = 
                        "_______________________________________________________________________\n" +
                        "|--          SICHERHEITSANLEITUNG - WEG CFW500 UMRICHTER            --|\n" +
                        "|_____________________________________________________________________|\n" +
                        "|-- ZIEL: Sicherheit bei Parametrierung und Wartung des             --|\n" +
                        "|   Frequenzumrichters WEG CFW500, zur Vermeidung von Unfällen.       |\n" +
                        "|_____________________________________________________________________|\n" +
                        "|                                                                     |\n" +
                        "| 1. ALLGEMEINE ANWEISUNGEN:                                          |\n" +
                        "|                                                                     |\n" +
                        "| - Handbuch des Frequenzumrichters vor jeglicher Maßnahme lesen.     |\n" +
                        "| - Nur geschultes Fachpersonal darf das Gerät bedienen.              |\n" +
                        "| - Niemals die Leiterplatte bei anliegender Spannung berühren.       |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 2. ABSCHALTUNG UND VORBEREITUNG:                                    |\n" +
                        "|                                                                     |\n" +
                        "| - Sicherungsautomat im Schaltschrank ausschalten.                   |\n" +
                        "| - Verriegelung und Kennzeichnung (LOTO) anwenden.                   |\n" +
                        "| - 15 Minuten nach Abschaltung warten.                               |\n" +
                        "| - Spannungsfreiheit an Klemmen R/S/T und U/V/W bestätigen.          |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 3. ERFORDERLICHE PSA:                                               |\n" +
                        "|                                                                     |\n" +
                        "| - Isolierte Handschuhe und Werkzeuge (1000V)                        |\n" +
                        "| - Schutzbrille                                                      |\n" +
                        "| - Sicherheitsschuhe                                                 |\n" +
                        "| - Spannungsprüfer                                                   |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 4. SICHERE PARAMETRIERUNG:                                          |\n" +
                        "|                                                                     |\n" +
                        "| - HMI des Umrichters oder WEG-Software mit isoliertem Kabel nutzen. |\n" +
                        "| - Prüfen, ob Last während der Einstellungen abgeklemmt ist.         |\n" +
                        "| - Parameter vor Wiederinbetriebnahme validieren.                    |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 5. ANWENDBARE NORMEN:                                               |\n" +
                        "|                                                                     |\n" +
                        "| - NR-10                                                             |\n" +
                        "| - NBR IEC 61800-5-1                                                 |\n" +
                        "| - Technisches Handbuch WEG CFW500                                   |\n" +
                        "|                                                                     |\n" +
                        "|_____________________________________________________________________|\n";

    }
    
    public void cadastrarManual() { //cadastro PT

        if (contadorCadastro < titulosProcedimentoSeguranca.length) {

            System.out.println(tradutor.get("tituloProcedSeg"));
            titulosProcedimentoSeguranca[contadorCadastro] = leia.nextLine();

            System.out.println(" ");

            System.out.println(tradutor.get("conteudoProcedSeg"));
            procedimentoSeguranca[contadorCadastro] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastro++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }
    }

    public void cadastrarManualEN() { //cadastro INGLES

        if (contadorCadastroEN < titulosProcedimentoSegurancaEN.length) {

            System.out.println(tradutor.get("tituloProcedSeg"));
            titulosProcedimentoSegurancaEN[contadorCadastroEN] = leia.nextLine();

            System.out.println(" ");

            System.out.println(tradutor.get("conteudoProcedSeg"));
            procedimentoSegurancaEN[contadorCadastroEN] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastroEN++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }
    }

    public void cadastrarManualDE() { //cadastro ALEMAO

        if (contadorCadastroDE < titulosProcedimentoSegurancaDE.length) {

            System.out.println(tradutor.get("tituloProcedSeg"));
            titulosProcedimentoSegurancaDE[contadorCadastroDE] = leia.nextLine();

            System.out.println(" ");

            System.out.println(tradutor.get("conteudoProcedSeg"));
            procedimentoSegurancaDE[contadorCadastroDE] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastroDE++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }
    }





    public void pesquisarManualTitulo() { //pesquisa TITULO em PT

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

			if (procedimentoSeguranca[i] != null) {
				System.out.println(titulosProcedimentoSeguranca[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

            if (titulosProcedimentoSeguranca[i] != null) {

                if (titulosProcedimentoSeguranca[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosProcedimentoSeguranca[i]);
                    System.out.println(procedimentoSeguranca[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();

    }

    public void pesquisarManualTituloEN() { //pesquisa TITULO em INGLES

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaEN.length; i++) {

			if (procedimentoSegurancaEN[i] != null) {
				System.out.println(titulosProcedimentoSegurancaEN[i]);
			}
		}

		System.out.println(" ");


		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosProcedimentoSegurancaEN.length; i++) {

            if (titulosProcedimentoSegurancaEN[i] != null) {

                if (titulosProcedimentoSegurancaEN[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosProcedimentoSegurancaEN[i]);
                    System.out.println(procedimentoSegurancaEN[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();

    }

    public void pesquisarManualTituloDE() { //pesquisa TITULO em ALEMAO

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaDE.length; i++) {

			if (procedimentoSegurancaDE[i] != null) {
				System.out.println(titulosProcedimentoSegurancaDE[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosProcedimentoSegurancaDE.length; i++) {

            if (titulosProcedimentoSegurancaDE[i] != null) {

                if (titulosProcedimentoSegurancaDE[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosProcedimentoSegurancaDE[i]);
                    System.out.println(procedimentoSegurancaDE[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
    }

    public void pesquisaManualCodigo() { //pesquisa CODIGO em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

			if (procedimentoSeguranca[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));

         while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		

        boolean encontrado = false;

        System.out.println(" ");

        if (titulosProcedimentoSeguranca[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosProcedimentoSeguranca[pesquisaCodigo]);

            System.out.println(procedimentoSeguranca[pesquisaCodigo]);
            encontrado = true;

        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
        leia.nextLine();

    }

    public void pesquisaManualCodigoEN() { //pesquisa CODIGO em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaEN.length; i++) {

			if (procedimentoSegurancaEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));
       
         while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		

        boolean encontrado = false;

        System.out.println(" ");

        if (titulosProcedimentoSegurancaEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosProcedimentoSegurancaEN[pesquisaCodigo]);

            System.out.println(procedimentoSegurancaEN[pesquisaCodigo]);
            encontrado = true;

        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
        leia.nextLine();

    }

    public void pesquisaManualCodigoDE() { //pesquisa CODIGO em ALEMAO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaDE.length; i++) {

			if (procedimentoSegurancaDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));
       
         while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		

        boolean encontrado = false;

        System.out.println(" ");

        if (titulosProcedimentoSegurancaDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosProcedimentoSegurancaDE[pesquisaCodigo]);

            System.out.println(procedimentoSegurancaDE[pesquisaCodigo]);
            encontrado = true;

        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }

        System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
        leia.nextLine();

    }



    

    public void editarManual() { //editar em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

			if (procedimentoSeguranca[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
       
         while (true) {
                try {
                    int codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        System.out.println(" ");

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            procedimentoSeguranca[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void editarManualEN() { //editar em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaEN.length; i++) {

			if (procedimentoSegurancaEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
        
         while (true) {
                try {
                    int codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        System.out.println(" ");

        if (titulosProcedimentoSegurancaEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosProcedimentoSegurancaEN[indiceCadastro] = leia.nextLine();
            titulosProcedimentoSegurancaEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            procedimentoSegurancaEN[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void editarManualDE() { //editar em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaDE.length; i++) {

			if (procedimentoSegurancaDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
        
         while (true) {
                try {
                    int codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        System.out.println(" ");

        if (titulosProcedimentoSegurancaDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosProcedimentoSegurancaDE[indiceCadastro] = leia.nextLine();
            titulosProcedimentoSegurancaDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            procedimentoSegurancaDE[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void excluirManual() { //excluir em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

			if (procedimentoSeguranca[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
        while (true) {
                try {
                     codigo = leia.nextInt();
                    int indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosProcedimentoSeguranca[i] = titulosProcedimentoSeguranca[i + 1];
                procedimentoSeguranca[i] = procedimentoSeguranca[i + 1];
            }

            titulosProcedimentoSeguranca[3] = null;
            procedimentoSeguranca[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastro--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

        } else {

            System.out.println(tradutor.get("delNEncontrado"));

        }

    }

    public void excluirManualEN() { //excluir em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaEN.length; i++) {

			if (procedimentoSegurancaEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
                while (true) {
                try {
                     codigo = leia.nextInt();
                    int indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        if (titulosProcedimentoSegurancaEN[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosProcedimentoSegurancaEN[i] = titulosProcedimentoSegurancaEN[i + 1];
                procedimentoSegurancaEN[i] = procedimentoSegurancaEN[i + 1];
            }

            titulosProcedimentoSegurancaEN[3] = null;
            procedimentoSegurancaEN[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroEN--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

        } else {

            System.out.println(tradutor.get("delNEncontrado"));

        }

    }

    public void excluirManualDE() { //excluir em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosProcedimentoSegurancaDE.length; i++) {

			if (procedimentoSegurancaDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
        while (true) {
                try {
                     codigo = leia.nextInt();
                    int indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

        if (titulosProcedimentoSegurancaDE[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosProcedimentoSegurancaDE[i] = titulosProcedimentoSegurancaDE[i + 1];
                procedimentoSegurancaDE[i] = procedimentoSegurancaDE[i + 1];
            }

            titulosProcedimentoSegurancaDE[3] = null;
            procedimentoSegurancaDE[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroDE--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

        } else {

            System.out.println(tradutor.get("delNEncontrado"));

        }

    }

}