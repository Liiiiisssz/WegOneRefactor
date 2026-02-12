package br.com.senai.centroweg.wegone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestesDiagnostico {

    Scanner leia = new Scanner(System.in);

    Traducoes tradutor;

    String[] testeDiagnostico = new String[4];
	String[] titulosTestesDiagnostico = new String[4];

    String[] testeDiagnosticoEN = new String[4];
	String[] titulosTestesDiagnosticoEN = new String[4];

    String[] testeDiagnosticoDE = new String[4];
	String[] titulosTestesDiagnosticoDE = new String[4];

    int contadorCadastro = 2;
    int contadorCadastroEN = 2;
    int contadorCadastroDE = 2;
    int pesquisaCodigo;
	int indiceCadastro;
	int codigo;

    public TestesDiagnostico(Traducoes tradutor){

        this.tradutor = tradutor;

        //manuais em PT
        titulosTestesDiagnostico[0] = "Teste de diagnostico para inversores de frequencia ";

        testeDiagnostico[0] = 

                "_______________________________________________________________________\n" +
				"|--        TESTE DE DIAGNÓSTICO PARA INVERSORES DE FREQUÊNCIA       --|\n" +
				"|_____________________________________________________________________|\n" +
			    "|-- OBJETIVO DO TESTE:                                              --|\n" +
				"| - Verificar o funcionamento correto do inversor de frequência WEG.  |\n" +
				"| - Diagnosticar falhas no sistema, como problemas de controle e      |\n" +
				"|   falhas nos componentes de potência ou no motor.                   |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. PREPARAÇÃO PARA O TESTE:                                         |\n" +
				"|                                                                     |\n" +
				"| - Desligue a alimentação do inversor e aguarde a dissipação da      |\n" +
				"|   carga residual.                                                   |\n" +
				"| - Verifique o inversor visualmente para danos físicos.              |\n" +
				"| - Certifique-se de que o motor está conectado corretamente.         |\n" + 
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
				"|                                                                     |\n" +                                                             
				"| 2. TESTE DE ISOLAMENTO:                                             |\n" +
				"|                                                                     |\n" +
				"| - Utilize um megômetro para testar o isolamento do motor.           |\n" +
				"| - Certifique-se de que a resistência de isolamento esteja dentro    |\n" +
				"|   das especificações.                                               |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
                "| 3. TESTE DE CONTROLE:                                               |\n" +
				"|                                                                     |\n" +
				"| - Conecte-se ao inversor usando o software de diagnóstico WEG.      |\n" +
				"| - Verifique as entradas e saídas de controle.                       |\n" +
				"| - Teste as frequências de saída.                                    |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 4. DIAGNÓSTICO DE FALHAS DE HARDWARE:                               |\n" +
				"|                                                                     |\n" +
				"| - Verifique os módulos de potência e procure por falhas.            |\n" +
				"| - Verifique os códigos de erro no display do inversor.              |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 5. TESTE DE MOTOR:                                                  |\n" +
				"|                                                                     |\n" +
				"| - Desconecte o motor e meça a resistência do enrolamento.           |\n" +
				"| - Compare os valores com as especificações do motor.                |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 6. RESULTADO E AÇÃO CORRETIVA:                                      |\n" +
				"|                                                                     |\n" +
				"| - Caso falhas sejam identificadas, consulte as instruções de        |\n" +
				"|   manutenção para ação corretiva.                                   |\n" +
				"|_____________________________________________________________________|\n" ;


      titulosTestesDiagnostico[1] =  "Manual de teste de diagnostico para motores eletricos ";

      testeDiagnostico[1] = 
                "_______________________________________________________________________\n" +
				"|--      MANUAL DE TESTE DE DIAGNÓSTICO PARA MOTORES ELÉTRICOS      --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO DO TESTE:                                              --|\n" +
				"| - Diagnosticar falhas elétricas e mecânicas em motores WEG.         |\n" +
				"| - Verificar o desempenho do motor, incluindo a isolação e as        |\n" +
				"|   condições de operação.                                            |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. PREPARAÇÃO PARA O TESTE:                                         |\n" +
				"|                                                                     |\n" +
				"| - Desligue a alimentação do motor e aguarde a dissipação da carga.  |\n" +
				"| - Verifique as conexões elétricas e mecânicas do motor.             |\n" +
				"| - Meça a tensão de alimentação do motor.                            |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
				"| 2. TESTE DE ISOLAMENTO:                                             |\n" +
				"|                                                                     |\n" +
				"| - Utilize um megômetro para testar o isolamento do motor.           |\n" +
				"| - Certifique-se de que a resistência de isolamento esteja dentro    |\n" +
				"|   das especificações.                                               |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
				"| 3. TESTE DE CORRENTE:                                               |\n" +
				"|                                                                     |\n" +
				"| - Meça a corrente de operação do motor.                             |\n" +
                "|   Compare com as especificações.                                    |\n" +
                "|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. TESTE DE RESISTÊNCIA DO ENROLAMENTO:                             |\n" +
				"|                                                                     |\n" +
				"| - Meça a resistência dos enrolamentos do motor.                     |\n" +
				"| - Compare os valores com as especificações do fabricante.           |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
				"| 5. RESULTADO E AÇÃO CORRETIVA:                                      |\n" +
				"|                                                                     |\n" +
				"| - Caso falhas sejam identificadas, consulte as recomendações do     |\n" +
				"|   fabricante para reparos e manutenção.                             |\n" +
				"|_____________________________________________________________________|\n";


        //manuais em INGLES
        titulosTestesDiagnosticoEN[0] = "Diagnostic Test for Frequency Inverters";

        testeDiagnosticoEN[0] = 
                "_______________________________________________________________________\n" +
                "|--        DIAGNOSTIC TEST FOR FREQUENCY INVERTERS                  --|\n" +
                "|_____________________________________________________________________|\n" +
                "|-- TEST OBJECTIVE:                                                 --|\n" +
                "| - Verify correct operation of the WEG frequency inverter.           |\n" +
                "| - Diagnose system faults such as control issues and failures in     |\n" +
                "|   power components or the motor.                                    |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. TEST PREPARATION:                                                |\n" +
                "|                                                                     |\n" +
                "| - Turn off the inverter power and wait for residual charge to       |\n" +
                "|   dissipate.                                                        |\n" +
                "| - Visually inspect the inverter for physical damage.                |\n" +
                "| - Ensure the motor is properly connected.                           |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. INSULATION TEST:                                                 |\n" +
                "|                                                                     |\n" +
                "| - Use a megohmmeter to test motor insulation.                       |\n" +
                "| - Ensure insulation resistance is within specifications.            |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. CONTROL TEST:                                                    |\n" +
                "|                                                                     |\n" +
                "| - Connect to the inverter using WEG diagnostic software.            |\n" +
                "| - Check control inputs and outputs.                                 |\n" +
                "| - Test output frequencies.                                          |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. HARDWARE FAILURE DIAGNOSIS:                                      |\n" +
                "|                                                                     |\n" +
                "| - Check power modules for failures.                                 |\n" +
                "| - Review error codes on the inverter display.                       |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. MOTOR TEST:                                                      |\n" +
                "|                                                                     |\n" +
                "| - Disconnect the motor and measure winding resistance.              |\n" +
                "| - Compare values to motor specifications.                           |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. RESULT AND CORRECTIVE ACTION:                                    |\n" +
                "|                                                                     |\n" +
                "| - If failures are identified, refer to maintenance instructions     |\n" +
                "|   for corrective action.                                            |\n" +
                "|_____________________________________________________________________|\n";

        
        titulosTestesDiagnosticoEN[1] = "Diagnostic Test Manual for Electric Motors";

        testeDiagnosticoEN[1] = 
                        "_______________________________________________________________________\n" +
                        "|--     DIAGNOSTIC TEST MANUAL FOR ELECTRIC MOTORS                  --|\n" +
                        "|_____________________________________________________________________|\n" +
                        "|-- TEST OBJECTIVE:                                                 --|\n" +
                        "| - Diagnose electrical and mechanical faults in WEG motors.          |\n" +
                        "| - Verify motor performance, including insulation and operating      |\n" +
                        "|   conditions.                                                       |\n" +
                        "|_____________________________________________________________________|\n" +
                        "|                                                                     |\n" +
                        "| 1. TEST PREPARATION:                                                |\n" +
                        "|                                                                     |\n" +
                        "| - Turn off motor power and wait for charge dissipation.             |\n" +
                        "| - Check electrical and mechanical connections of the motor.         |\n" +
                        "| - Measure motor supply voltage.                                     |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "| 2. INSULATION TEST:                                                 |\n" +
                        "|                                                                     |\n" +
                        "| - Use a megohmmeter to test motor insulation.                       |\n" +
                        "| - Ensure insulation resistance is within specifications.            |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "| 3. CURRENT TEST:                                                    |\n" +
                        "|                                                                     |\n" +
                        "| - Measure motor operating current.                                  |\n" +
                        "| - Compare with specifications.                                      |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 4. WINDING RESISTANCE TEST:                                         |\n" +
                        "|                                                                     |\n" +
                        "| - Measure the resistance of the motor windings.                     |\n" +
                        "| - Compare values with the manufacturer’s specifications.            |\n" +
                        "|                                                                     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "| 5. RESULT AND CORRECTIVE ACTION:                                    |\n" +
                        "|                                                                     |\n" +
                        "| - If failures are identified, follow manufacturer recommendations   |\n" +
                        "|   for repair and maintenance.                                       |\n" +
                        "|_____________________________________________________________________|\n";


        //manuais em ALEMAO
        titulosTestesDiagnosticoDE[0] = "Diagnosetest für Frequenzumrichter";

        testeDiagnosticoDE[0] = 
                "_______________________________________________________________________\n" +
                "|--        DIAGNOSETEST FÜR FREQUENZUMRICHTER                       --|\n" +
                "|_____________________________________________________________________|\n" +
                "|-- TESTZIEL:                                                       --|\n" +
                "| - Überprüfung des korrekten Betriebs des WEG-Frequenzumrichters.    |\n" +
                "| - Diagnose von Systemfehlern wie Steuerproblemen und                |\n" +
                "|   Defekten an Leistungskomponenten oder dem Motor.                  |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. TESTVORBEREITUNG:                                                |\n" +
                "|                                                                     |\n" +
                "| - Netzversorgung des Umrichters abschalten und Restladung abwarten. |\n" +
                "| - Sichtprüfung des Umrichters auf physische Schäden.                |\n" +
                "| - Sicherstellen, dass der Motor korrekt angeschlossen ist.          |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. ISOLATIONSTEST:                                                  |\n" +
                "|                                                                     |\n" +
                "| - Isolationsmessgerät (Megohmmeter) zur Prüfung verwenden.          |\n" +
                "| - Sicherstellen, dass der Isolationswiderstand den                  |\n" +
                "|   Vorgaben entspricht.                                              |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. STEUERUNGSTEST:                                                  |\n" +
                "|                                                                     |\n" +
                "| - Mit WEG-Diagnosesoftware Verbindung zum Umrichter herstellen.     |\n" +
                "| - Steuerungs-Ein- und Ausgänge prüfen.                              |\n" +
                "| - Ausgangsfrequenzen testen.                                        |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. DIAGNOSE VON HARDWAREFEHLERN:                                    |\n" +
                "|                                                                     |\n" +
                "| - Leistungsmodule auf Fehler überprüfen.                            |\n" +
                "| - Fehlercodes auf dem Display des Umrichters prüfen.                |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. MOTORTEST:                                                       |\n" +
                "|                                                                     |\n" +
                "| - Motor abklemmen und Wicklungswiderstand messen.                   |\n" +
                "| - Werte mit den Motorspezifikationen vergleichen.                   |\n" +
                "|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. ERGEBNIS UND KORREKTURMASSNAHMEN:                                |\n" +
                "|                                                                     |\n" +
                "| - Bei festgestellten Fehlern die Wartungsanweisungen konsultieren.  |\n" +
                "|_____________________________________________________________________|\n";

        titulosTestesDiagnosticoDE[1] = "Diagnosetest-Handbuch für Elektromotoren";

        testeDiagnosticoDE[1] = 
                        "________________________________________________________________________\n" +
                        "|--     DIAGNOSETEST-HANDBUCH FÜR ELEKTROMOTOREN                     --|\n" +
                        "|______________________________________________________________________|\n" +
                        "|-- TESTZIEL:                                                        --|\n" +
                        "| - Diagnose von elektrischen und mechanischen Fehlern bei WEG-Motoren.|\n" +
                        "| - Überprüfung der Motorleistung, inklusive Isolierung und            |\n" +
                        "|   Betriebsbedingungen.                                               |\n" +
                        "|______________________________________________________________________|\n" +
                        "|                                                                      |\n" +
                        "| 1. TESTVORBEREITUNG:                                                 |\n" +
                        "|                                                                      |\n" +
                        "| - Netzversorgung des Motors abschalten und Entladung abwarten.       |\n" +
                        "| - Elektrische und mechanische Verbindungen prüfen.                   |\n" +
                        "| - Versorgungsspannung des Motors messen.                             |\n" +
                        "|                                                                      |\n" +
                        "|----------------------------------------------------------------------|\n" +
                        "| 2. ISOLATIONSTEST:                                                   |\n" +
                        "|                                                                      |\n" +
                        "| - Isolationsmessgerät zur Prüfung verwenden.                         |\n" +
                        "| - Sicherstellen, dass der Isolationswiderstand innerhalb der         |\n" +
                        "|   Spezifikation liegt.                                               |\n" +
                        "|                                                                      |\n" +
                        "|----------------------------------------------------------------------|\n" +
                        "| 3. STROMTEST:                                                        |\n" +
                        "|                                                                      |\n" +
                        "| - Betriebsstrom des Motors messen.                                   |\n" +
                        "| - Mit den Spezifikationen vergleichen.                               |\n" +
                        "|----------------------------------------------------------------------|\n" +
                        "|                                                                      |\n" +
                        "| 4. WICKLUNGSWIDERSTANDSTEST:                                         |\n" +
                        "|                                                                      |\n" +
                        "| - Wicklungswiderstand des Motors messen.                             |\n" +
                        "| - Werte mit den Herstellerspezifikationen vergleichen.               |\n" +
                        "|                                                                      |\n" +
                        "|----------------------------------------------------------------------|\n" +
                        "| 5. ERGEBNIS UND KORREKTURMASSNAHMEN:                                 |\n" +
                        "|                                                                      |\n" +
                        "| - Bei Fehlern die Empfehlungen des Herstellers zur Reparatur         |\n" +
                        "|   und Wartung befolgen.                                              |\n" +
                        "|______________________________________________________________________|\n";
            
    }
    
    public void cadastrarManual() { //cadastro em PT

        if (contadorCadastro < titulosTestesDiagnostico.length) {

            System.out.println(tradutor.get("tituloTestDiag"));
            titulosTestesDiagnostico[contadorCadastro] = leia.nextLine();
           
            System.out.println(" ");

            System.out.println(tradutor.get("conteudoTestDiag"));
            testeDiagnostico[contadorCadastro] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastro++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }

    }

    public void cadastrarManualEN() { //cadastro em INGLES

        if (contadorCadastroEN < titulosTestesDiagnosticoEN.length) {

            System.out.println(tradutor.get("tituloTestDiag"));
            titulosTestesDiagnosticoEN[contadorCadastroEN] = leia.nextLine();
           
            System.out.println(" ");

            System.out.println(tradutor.get("conteudoTestDiag"));
            testeDiagnosticoEN[contadorCadastroEN] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastroEN++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }

    }

    public void cadastrarManualDE() { //cadastro em ALEMAO

        if (contadorCadastroDE < titulosTestesDiagnosticoDE.length) {

            System.out.println(tradutor.get("tituloTestDiag"));
            titulosTestesDiagnosticoDE[contadorCadastroDE] = leia.nextLine();
           
            System.out.println(" ");

            System.out.println(tradutor.get("conteudoTestDiag"));
            testeDiagnosticoDE[contadorCadastroDE] = leia.nextLine();
            System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

            contadorCadastroDE++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }

    }





    public void pesquisarManualTitulo() { //pesquisar TITULO em PT

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

			if (testeDiagnostico[i] != null) {
				System.out.println(titulosTestesDiagnostico[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

            if (titulosTestesDiagnostico[i] != null) {

                if (titulosTestesDiagnostico[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosTestesDiagnostico[i]);
                    System.out.println(testeDiagnostico[i]);
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

    public void pesquisarManualTituloEN() { //pesquisar TITULO em INGLES

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoEN.length; i++) {

			if (testeDiagnosticoEN[i] != null) {
				System.out.println(titulosTestesDiagnosticoEN[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosTestesDiagnosticoEN.length; i++) {

            if (titulosTestesDiagnosticoEN[i] != null) {

                if (titulosTestesDiagnosticoEN[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosTestesDiagnosticoEN[i]);
                    System.out.println(testeDiagnosticoEN[i]);
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

    public void pesquisarManualTituloDE() { //pesquisar TITULO em ALEMÃO

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoDE.length; i++) {

			if (testeDiagnosticoDE[i] != null) {
				System.out.println(titulosTestesDiagnosticoDE[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosTestesDiagnosticoDE.length; i++) {

            if (titulosTestesDiagnosticoDE[i] != null) {

                if (titulosTestesDiagnosticoDE[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosTestesDiagnosticoDE[i]);
                    System.out.println(testeDiagnosticoDE[i]);
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

    public void pesquisaManualCodigo() { //pesquisar CODIGO em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

			if (testeDiagnostico[i] != null) {
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

        if (titulosTestesDiagnostico[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosTestesDiagnostico[pesquisaCodigo]);

            System.out.println(testeDiagnostico[pesquisaCodigo]);
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

    public void pesquisaManualCodigoEN() { //pesquisar CODIGO em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoEN.length; i++) {

			if (testeDiagnosticoEN[i] != null) {
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

        if (titulosTestesDiagnosticoEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosTestesDiagnosticoEN[pesquisaCodigo]);

            System.out.println(testeDiagnosticoEN[pesquisaCodigo]);
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

    public void pesquisaManualCodigoDE() { //pesquisar CODIGO em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoDE.length; i++) {

			if (testeDiagnosticoDE[i] != null) {
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

        if (titulosTestesDiagnosticoDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosTestesDiagnosticoDE[pesquisaCodigo]);

            System.out.println(testeDiagnosticoDE[pesquisaCodigo]);
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





    public void editarManual() { //editar PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

			if (testeDiagnostico[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
        
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnostico[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosTestesDiagnostico[indiceCadastro] = leia.nextLine();
            titulosTestesDiagnostico[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            testeDiagnostico[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void editarManualEN() { //editar INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoEN.length; i++) {

			if (testeDiagnosticoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
       
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnosticoEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosTestesDiagnosticoEN[indiceCadastro] = leia.nextLine();
            titulosTestesDiagnosticoEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            testeDiagnosticoEN[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void editarManualDE() { //editar ALEMAO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoDE.length; i++) {

			if (testeDiagnosticoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
        
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnosticoDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosTestesDiagnosticoDE[indiceCadastro] = leia.nextLine();
            titulosTestesDiagnosticoDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            testeDiagnosticoDE[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }





    public void excluirManual() { //excluir PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

			if (testeDiagnostico[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnostico[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosTestesDiagnostico[i] = titulosTestesDiagnostico[i + 1];
                testeDiagnostico[i] = testeDiagnostico[i + 1];
            }

            titulosTestesDiagnostico[3] = null;
            testeDiagnostico[3] = null;

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

    public void excluirManualEN() { //excluir INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoEN.length; i++) {

			if (testeDiagnosticoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnosticoEN[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosTestesDiagnosticoEN[i] = titulosTestesDiagnosticoEN[i + 1];
                testeDiagnosticoEN[i] = testeDiagnosticoEN[i + 1];
            }

            titulosTestesDiagnosticoEN[3] = null;
            testeDiagnosticoEN[3] = null;

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

    public void excluirManualDE() { //excluir ALEMAO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosTestesDiagnosticoDE.length; i++) {

			if (testeDiagnosticoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
        
         while (true) {

                try {
                      codigo = leia.nextInt();
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

        if (titulosTestesDiagnosticoDE[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosTestesDiagnosticoDE[i] = titulosTestesDiagnosticoDE[i + 1];
                testeDiagnosticoDE[i] = testeDiagnosticoDE[i + 1];
            }

            titulosTestesDiagnosticoDE[3] = null;
            testeDiagnosticoDE[3] = null;

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
