package br.com.senai.centroweg.wegone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManutencaoReparos {

    Scanner leia = new Scanner(System.in);

        Traducoes tradutor;

    String[] manutencaoReparos = new String[4];
    String[] titulosManutencaoReparos = new String[4];

    String[] manutencaoReparosEN = new String[4];
    String[] titulosManutencaoReparosEN = new String[4];

    String[] manutencaoReparosDE = new String[4];
    String[] titulosManutencaoReparosDE = new String[4];

    int contadorCadastro = 2;
    int contadorCadastroEN = 2;
    int contadorCadastroDE = 2;
    int pesquisaCodigo;
    int indiceCadastro;
    int codigo;

    public ManutencaoReparos(Traducoes tradutor){

        this.tradutor = tradutor;

        //manuais em PT
        titulosManutencaoReparos[0] = "Manutencao de motores eletricos";

        manutencaoReparos[0] =
                "_________________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão par    --|\n" +
                "|    o setor de manutenção de motores elétricos, garantindo a           |\n" +
                "|    eficiência e a segurança                                           |\n" +
                "|_______________________________________________________________________|\n" +
                "|                                                                       |\n" +
                "| 1. OBJETIVO DO SETOR DE MANUTENÇÃO:                                   |\n" +
                "|                                                                       |\n" +
                "| - Garantir a operação contínua e segura dos motores elétricos.        |\n" +
                "| - Realizar manutenção preventiva, corretiva e preditiva conforme os   |\n" +
                "|   planos e cronogramas estabelecidos.                                 |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 2. MANUTENÇÃO PREVENTIVA:                                             |\n" +
                "|                                                                       |\n" +
                "| - Inspecionar regularmente os motores elétricos quanto a sinais de    |\n" +
                "|   desgaste, vibração excessiva ou aquecimento.                        |\n" +
                "| - Verificar o alinhamento e balanceamento do motor.                   |\n" +
                "| - Realizar lubrificação nos pontos recomendados pelo fabricante.      |\n" +
                "| - Limpar os motores de poeira e resíduos para                         |\n" +
                "|   evitar o superaquecimento.                                          |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 3. MANUTENÇÃO CORRETIVA:                                              |\n" +
                "|                                                                       |\n" +
                "| - Quando ocorrer falha no motor, identificar a causa e realizar os    |\n" +
                "|   reparos necessários com agilidade.                                  |\n" +
                "| - Substituir componentes danificados, como rolamentos, escovas e      |\n" +
                "|   estatores.                                                          |\n" +
                "| - Testar o motor após o reparo para garantir seu funcionamento        |\n" +
                "|   correto.                                                            |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 4. MANUTENÇÃO PREDITIVA:                                              |\n" +
                "|                                                                       |\n" +
                "| - Utilizar tecnologias de monitoramento como termografia e análise    |\n" +
                "|   de vibração para prever falhas no motor antes que ocorram.          |\n" +
                "| - Implementar sensores de temperatura e vibração para                 |\n" +
                "|   um acompanhamento contínuo.                                         |\n" +
                "| - Manter registros detalhados dos dados de monitoramento para         |\n" +
                "|   otimizar a manutenção.                                              |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NA MANUTENÇÃO:                          |\n" +
                "|                                                                       |\n" +
                "| - Desligar a alimentação elétrica do motor antes de iniciar qualquer  |\n" +
                "|   procedimento de manutenção.                                         |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados, como |\n" +
                "|   luvas isolantes, capacetes e óculos de segurança.                   |\n" +
                "| - Garantir que os procedimentos de bloqueio e etiquetagem sejam       |\n" +
                "|   seguidos para segurança.                                            |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE MANUTENÇÃO:                            |\n" +
                "|                                                                       |\n" +
                "| - Registrar todas as atividades de manutenção, incluindo data, tipo   |\n" +
                "|   de serviço e peças substituídas.                                    |\n" +
                "| - Manter um histórico dos testes realizados, como medições de corrente|\n" +
                "|   e resistência do motor.                                             |\n" +
                "| - Elaborar relatórios sobre falhas recorrentes e ações corretivas.    |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                         |\n" +
                "|                                                                       |\n" +
                "| - Promover treinamentos periódicos sobre diagnóstico de falhas e      |\n" +
                "|   técnicas de reparo em motores elétricos.                            |\n" +
                "| - Instruir os colaboradores sobre os riscos elétricos e a             |\n" +
                "|   segurança no trabalho.                                              |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                  |\n" +
                "|                                                                       |\n" +
                "| - Em caso de acidente, acionar imediatamente o supervisor e a equipe  |\n" +
                "|   de segurança.                                                       |\n" +
                "| - Registrar o incidente conforme as normas internas e realizar uma    |\n" +
                "|   análise de causa raiz para prevenir futuros acidentes.              |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                  |\n" +
                "|                                                                       |\n" +
                "| - Seguir as normas NBR (Normas Brasileiras) para segurança em         |\n" +
                "|   sistemas elétricos.                                                 |\n" +
                "| - Cumprir com as recomendações do fabricante para instalação,         |\n" +
                "|   operação e manutenção dos motores.                                  |\n" +
                "|_______________________________________________________________________|\n";


        titulosManutencaoReparos[1] = "Reparo de transformadores";

        manutencaoReparos[1] = 
                "_________________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão para   --|\n" +
                "|    o setor de reparo de transformadores, garantindo a eficiência      |\n" +
                "|    e a segurança.                                                     |\n" +
                "|_______________________________________________________________________|\n" +
                "|                                                                       |\n" +
                "| 1. OBJETIVO DO SETOR DE REPARO:                                       |\n" +
                "|                                                                       |\n" +
                "| - Garantir a operação contínua e segura dos transformadores.          |\n" +
                "| - Realizar reparos corretivos e preventivos conforme os planos e      |\n" +
                "|   cronogramas estabelecidos.                                          |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 2. REPARO PREVENTIVO:                                                 |\n" +
                "|                                                                       |\n" +
                "| - Inspecionar periodicamente os transformadores quanto a sinais de    |\n" +
                "|   aquecimento excessivo, ruídos ou vibrações anormais.                |\n" +
                "| - Verificar o estado dos isolantes e das buchas de entrada e saída.   |\n" +
                "| - Realizar testes de resistência de isolamento para detectar falhas   |\n" +
                "|   antes que ocorra a falha completa do equipamento.                   |\n" +
                "| - Limpar os transformadores de poeira e contaminantes para evitar     |\n" +
                "|   problemas de sobreaquecimento e falhas elétricas.                   |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 3. REPARO CORRETIVO:                                                  |\n" +
                "|                                                                       |\n" +
                "| - Quando ocorrer falha em algum transformador, a equipe de reparo     |\n" +
                "|  deve diagnosticar a causa da falha e realizar a correção necessária. |\n" +
                "| - Substituir componentes danificados, como buchas, transformadores    |\n" +
                "|  de corrente ou de tensão, e sistemas de resfriamento, se aplicável.  |\n" +
                "| - Realizar testes após o reparo para assegurar o bom funcionamento    |\n" +
                "|   do transformador.                                                   |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 4. REPARO PREDITIVO:                                                  |\n" +
                "|                                                                       |\n" +
                "| - Utilizar tecnologias de monitoramento de condição, como sensores    |\n" +
                "|   de temperatura e umidade, para identificar falhas antes que         |\n" +
                "|   ocorram.                                                            |\n" +
                "| - Realizar medições de corrente e resistência para avaliar a saúde    |\n" +
                "|   do transformador e detectar falhas iminentes.                       |\n" +
                "| - Manter registros detalhados dos dados coletados para otimizar o     |\n" +
                "|   planejamento de manutenção.                                         |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NO REPARO:                              |\n" +
                "|                                                                       |\n" +
                "| - Desligar a alimentação elétrica do transformador antes de iniciar   |\n" +
                "|   qualquer intervenção.                                               |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados, como |\n" +
                "|  luvas isolantes, capacetes, óculos de segurança e botas de segurança.|\n" +
                "| - Garantir que os procedimentos de bloqueio e etiquetagem sejam       |\n" +
                "|   seguidos para segurança.                                            |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE REPARO:                                |\n" +
                "|                                                                       |\n" +
                "| - Manter registros completos de todos os reparos realizados, com      |\n" +
                "|   descrição detalhada do defeito encontrado e solução aplicada.       |\n" +
                "| - Registrar os testes realizados, como medições de resistência e      |\n" +
                "|   corrente.                                                           |\n" +
                "| - Elaborar relatórios sobre falhas e ações corretivas implementadas.  |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                         |\n" +
                "|                                                                       |\n" +
                "| - Promover treinamentos sobre as técnicas de diagnóstico e reparo     |\n" +
                "|   em transformadores, incluindo os riscos elétricos envolvidos.       |\n" +
                "| - Instruir os colaboradores sobre as normas de segurança e o uso      |\n" +
                "|   adequado de ferramentas.                                            |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                  |\n" +
                "|                                                                       |\n" +
                "| - Em caso de acidente, acionar imediatamente a equipe de segurança    |\n" +
                "|   e registrar o incidente conforme as normas internas.                |\n" +
                "| - Realizar uma análise do incidente para identificar suas causas e    |\n" +
                "|   implementar ações corretivas para evitar a repetição do acidente.   |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                  |\n" +
                "|                                                                       |\n" +
                "| - Seguir as normas NBR (Normas Brasileiras) para segurança em         |\n" +
                "|   sistemas elétricos e transformadores.                               |\n" +
                "| - Cumprir com as orientações do fabricante para instalação, operação  |\n" +
                "|   e manutenção dos transformadores.                                   |\n" +
                "|_______________________________________________________________________|\n";




        //manuais em INGLES
        titulosManutencaoReparosEN[0] = "Electric Motor Maintenance";

        manutencaoReparosEN[0] = 
                "_______________________________________________________________________\n" +
                "|-- OBJECTIVE: Establish standard operating procedures for the      --|\n" +
                "|   electric motor maintenance sector, ensuring efficiency and safety |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. MAINTENANCE DEPARTMENT OBJECTIVE:                                |\n" +
                "|                                                                     |\n" +
                "| - Ensure the continuous and safe operation of electric motors.      |\n" +
                "| - Perform preventive, corrective, and predictive maintenance        |\n" +
                "|   according to established plans and schedules.                     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. PREVENTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - Regularly inspect electric motors for signs of wear, excessive    |\n" +
                "|   vibration, or overheating.                                        |\n" +
                "| - Check motor alignment and balance.                                |\n" +
                "| - Lubricate at points recommended by the manufacturer.              |\n" +
                "| - Clean motors from dust and debris to prevent overheating.         |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. CORRECTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - When a motor fails, identify the cause and carry out the          |\n" +
                "|   necessary repairs promptly.                                       |\n" +
                "| - Replace damaged components such as bearings, brushes, and stators.|\n" +
                "| - Test the motor after repair to ensure proper operation.           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. PREDICTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - Use monitoring technologies such as thermography and vibration    |\n" +
                "|   analysis to predict failures before they occur.                   |\n" +
                "| - Implement temperature and vibration sensors for continuous        |\n" +
                "|   monitoring.                                                       |\n" +
                "| - Keep detailed records of monitoring data to optimize maintenance. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. SAFETY PROCEDURES DURING MAINTENANCE:                            |\n" +
                "|                                                                     |\n" +
                "| - Disconnect the motor’s power supply before starting any           |\n" +
                "|   maintenance procedure.                                            |\n" +
                "| - Use appropriate Personal Protective Equipment (PPE), such as      |\n" +
                "|   insulated gloves, helmets, and safety glasses.                    |\n" +
                "| - Ensure lockout and tagout procedures are followed for safety.     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. MAINTENANCE DOCUMENTATION AND RECORDS:                           |\n" +
                "|                                                                     |\n" +
                "| - Record all maintenance activities, including date, type of        |\n" +
                "|   service, and replaced parts.                                      |\n" +
                "| - Keep a history of tests performed, such as current and resistance |\n" +
                "|   measurements.                                                     |\n" +
                "| - Prepare reports on recurring failures and corrective actions.     |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. TRAINING AND QUALIFICATION:                                      |\n" +
                "|                                                                     |\n" +
                "| - Promote regular training on fault diagnosis and repair techniques |\n" +
                "|   for electric motors.                                              |\n" +
                "| - Train employees on electrical hazards and workplace safety.       |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. PROCEDURES IN CASE OF INCIDENTS OR ACCIDENTS:                    |\n" +
                "|                                                                     |\n" +
                "| - In case of an accident, immediately notify the supervisor and     |\n" +
                "|   the safety team.                                                  |\n" +
                "| - Record the incident according to internal rules and perform a     |\n" +
                "|   root cause analysis to prevent future accidents.                  |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. APPLICABLE STANDARDS AND REGULATIONS:                            |\n" +
                "|                                                                     |\n" +
                "| - Follow NBR (Brazilian Standards) for safety in electrical systems.|\n" +
                "| - Comply with the manufacturer's recommendations for installation,  |\n" +
                "|   operation, and maintenance of motors.                             |\n" +
                "|_____________________________________________________________________|\n";


        titulosManutencaoReparosEN[1] = "Transformer Repair";

        manutencaoReparosEN[1] = 
                        "_______________________________________________________________________\n" +
                        "|-- OBJECTIVE: Establish standard operating procedures for the      --|\n" +
                        "|    transformer repair sector, ensuring efficiency and safety        |\n" +
                        "|_____________________________________________________________________|\n" +
                        "|                                                                     |\n" +
                        "| 1. REPAIR DEPARTMENT OBJECTIVE:                                     |\n" +
                        "|                                                                     |\n" +
                        "| - Ensure the continuous and safe operation of transformers.         |\n" +
                        "| - Perform corrective and preventive repairs according to the        |\n" +
                        "|   established plans and schedules.                                  |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 2. PREVENTIVE REPAIR:                                               |\n" +
                        "|                                                                     |\n" +
                        "| - Periodically inspect transformers for signs of excessive heating, |\n" +
                        "|   unusual noises, or abnormal vibrations.                           |\n" +
                        "| - Check the condition of insulators and input/output bushings.      |\n" +
                        "| - Perform insulation resistance tests to detect failures before     |\n" +
                        "|   total equipment breakdown.                                        |\n" +
                        "| - Clean transformers from dust and contaminants to prevent          |\n" +
                        "|   overheating and electrical faults.                                |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 3. CORRECTIVE REPAIR:                                               |\n" +
                        "|                                                                     |\n" +
                        "| - When a transformer fails, the repair team must diagnose the cause |\n" +
                        "|   and carry out the necessary correction.                           |\n" +
                        "| - Replace damaged components such as bushings, current or voltage   |\n" +
                        "|   transformers, and cooling systems if applicable.                  |\n" +
                        "| - Conduct tests after the repair to ensure proper transformer       |\n" +
                        "|   operation.                                                        |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 4. PREDICTIVE REPAIR:                                               |\n" +
                        "|                                                                     |\n" +
                        "| - Use condition monitoring technologies such as temperature and     |\n" +
                        "|   humidity sensors to identify failures before they occur.          |\n" +
                        "| - Perform current and resistance measurements to assess transformer |\n" +
                        "|   health and detect imminent failures.                              |\n" +
                        "| - Keep detailed records of collected data to optimize maintenance   |\n" +
                        "|   planning.                                                         |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 5. SAFETY PROCEDURES DURING REPAIR:                                 |\n" +
                        "|                                                                     |\n" +
                        "| - Disconnect the transformer’s power supply before starting any     |\n" +
                        "|   intervention.                                                     |\n" +
                        "| - Use appropriate Personal Protective Equipment (PPE), such as      |\n" +
                        "|   insulating gloves, helmets, safety glasses, and safety boots.     |\n" +
                        "| - Ensure lockout and tagout procedures are followed for safety.     |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 6. REPAIR DOCUMENTATION AND RECORDS:                                |\n" +
                        "|                                                                     |\n" +
                        "| - Maintain complete records of all repairs performed, including a   |\n" +
                        "|   detailed description of the fault and applied solution.           |\n" +
                        "| - Record the tests performed, such as resistance and current        |\n" +
                        "|   measurements.                                                     |\n" +
                        "| - Prepare reports on failures and corrective actions implemented.   |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 7. TRAINING AND QUALIFICATION:                                      |\n" +
                        "|                                                                     |\n" +
                        "| - Promote training on diagnostic and repair techniques for          |\n" +
                        "|   transformers, including associated electrical risks.              |\n" +
                        "| - Instruct employees on safety standards and proper use of tools.   |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 8. PROCEDURES IN CASE OF INCIDENTS OR ACCIDENTS:                    |\n" +
                        "|                                                                     |\n" +
                        "| - In case of an accident, immediately notify the safety team and    |\n" +
                        "|   record the incident according to internal standards.              |\n" +
                        "| - Perform an incident analysis to identify its causes and implement |\n" +
                        "|   corrective actions to avoid recurrence.                           |\n" +
                        "|---------------------------------------------------------------------|\n" +
                        "|                                                                     |\n" +
                        "| 9. APPLICABLE STANDARDS AND REGULATIONS:                            |\n" +
                        "|                                                                     |\n" +
                        "| - Follow NBR (Brazilian Standards) for safety in electrical systems |\n" +
                        "|   and transformers.                                                 |\n" +
                        "| - Comply with the manufacturer's guidelines for installation,       |\n" +
                        "|   operation, and maintenance of transformers.                       |\n" +
                        "|---------------------------------------------------------------------|\n";




        
        //manuais em ALEMÃO
        titulosManutencaoReparosDE[0] = "Wartung von Elektromotoren";

        manutencaoReparosDE[0] = 

                "________________________________________________________________________\n" +
                "|-- ZIEL: Festlegung standardisierter Betriebsverfahren für den      --|\n" +
                "|   Bereich Wartung von Elektromotoren zur Gewährleistung              |\n" +
                "|   von Effizienz und Sicherheit                                       |\n" +
                "|______________________________________________________________________|\n" +
                "|                                                                      |\n" +
                "| 1. ZIEL DER WARTUNGSABTEILUNG:                                       |\n" +
                "|                                                                      |\n" +
                "| - Sicherstellung des kontinuierlichen und sicheren Betriebs von      |\n" +
                "|   Elektromotoren.                                                    |\n" +
                "| - Durchführung präventiver, korrektiver und prädiktiver Wartung      |\n" +
                "|   gemäß den festgelegten Plänen und Zeitplänen.                      |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 2. PRÄVENTIVE WARTUNG:                                               |\n" +
                "|                                                                      |\n" +
                "| - Regelmäßige Inspektion der Motoren auf Anzeichen von Verschleiß,   |\n" +
                "|   übermäßiger Vibration oder Überhitzung.                            |\n" +
                "| - Überprüfung der Ausrichtung und des Gleichgewichts des Motors.     |\n" +
                "| - Schmierung der vom Hersteller empfohlenen Punkte.                  |\n" +
                "| - Reinigung der Motoren von Staub und Ablagerungen zur Vermeidung    |\n" +
                "|   von Überhitzung.                                                   |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 3. KORREKTIVE WARTUNG:                                               |\n" +
                "|                                                                      |\n" +
                "| - Bei Motorausfall die Ursache schnellstmöglich identifizieren und   |\n" +
                "|   notwendige Reparaturen durchführen.                                |\n" +
                "| - Austausch beschädigter Komponenten wie Lager, Bürsten und Statoren.|\n" +
                "| - Test des Motors nach der Reparatur zur Sicherstellung des          |\n" +
                "|   ordnungsgemäßen Betriebs.                                          |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 4. PRÄDIKTIVE WARTUNG:                                               |\n" +
                "|                                                                      |\n" +
                "| - Einsatz von Überwachungstechnologien wie Thermografie und          |\n" +
                "|   Vibrationsanalyse zur Vorhersage von Ausfällen.                    |\n" +
                "| - Implementierung von Temperatur- und Vibrationssensoren für eine    |\n" +
                "|   kontinuierliche Überwachung.                                       |\n" +
                "| - Führen detaillierter Aufzeichnungen über die Überwachungsdaten     |\n" +
                "|   zur Optimierung der Wartung.                                       |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 5. SICHERHEITSVERFAHREN BEI DER WARTUNG:                             |\n" +
                "|                                                                      |\n" +
                "| - Vor Beginn jeglicher Wartungsarbeiten Stromversorgung des Motors   |\n" +
                "|   abschalten.                                                        |\n" +
                "| - Verwendung geeigneter Persönlicher Schutzausrüstung (PSA) wie      |\n" +
                "|   isolierende Handschuhe, Helme und Schutzbrillen.                   |\n" +
                "| - Einhaltung der Sperr- und Kennzeichnungsverfahren zur Sicherheit.  |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 6. DOKUMENTATION UND WARTUNGSPROTOKOLLE:                             |\n" +
                "|                                                                      |\n" +
                "| - Protokollierung aller Wartungsaktivitäten, einschließlich Datum,   |\n" +
                "|   Art der Dienstleistung und ersetzter Teile.                        |\n" +
                "| - Führen eines Verlaufs der durchgeführten Tests wie Strom- und      |\n" +
                "|   Widerstandsmessungen des Motors.                                   |\n" +
                "| - Erstellung von Berichten über wiederkehrende Fehler und            |\n" +
                "|   Korrekturmaßnahmen.                                                |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 7. SCHULUNG UND QUALIFIZIERUNG:                                      |\n" +
                "|                                                                      |\n" +
                "| - Durchführung regelmäßiger Schulungen zur Fehlerdiagnose und        |\n" +
                "|   Reparaturtechniken für Elektromotoren.                             |\n" +
                "| - Unterweisung der Mitarbeitenden über elektrische Gefahren und      |\n" +
                "|   Arbeitssicherheit.                                                 |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 8. VORGEHEN BEI VORFÄLLEN ODER UNFÄLLEN:                             |\n" +
                "|                                                                      |\n" +
                "| - Bei einem Unfall sofort den Vorgesetzten und das Sicherheitsteam   |\n" +
                "|   informieren.                                                       |\n" +
                "| - Dokumentation des Vorfalls gemäß interner Vorschriften und         |\n" +
                "|   Durchführung einer Ursachenanalyse zur Vermeidung zukünftiger      |\n" +
                "|   Unfälle.                                                           |\n" +
                "|----------------------------------------------------------------------|\n" +
                "|                                                                      |\n" +
                "| 9. GELTENDE NORMEN UND VORSCHRIFTEN:                                 |\n" +
                "|                                                                      |\n" +
                "| - Einhaltung der NBR-Normen (brasilianische Normen) für Sicherheit   |\n" +
                "|   in elektrischen Systemen.                                          |\n" +
                "| - Befolgung der Herstellervorgaben zur Installation, zum Betrieb     |\n" +
                "|   und zur Wartung von Motoren.                                       |\n" +
                "|______________________________________________________________________|\n";


        titulosManutencaoReparosDE[1] = "Reparatur von Transformatoren";

        manutencaoReparosDE[1] = 
               " _______________________________________________________________________\n" +
                "|-- ZIEL: Festlegung standardisierter Betriebsverfahren für den     --|\n" +
                "|   Bereich Transformatorreparatur zur Gewährleistung von Effizienz   |\n" +
                "|   und Sicherheit                                                    |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. ZIEL DER REPARATURABTEILUNG:                                     |\n" +
                "|                                                                     |\n" +
                "| - Sicherstellung des kontinuierlichen und sicheren Betriebs von     |\n" +
                "|   Transformatoren.                                                  |\n" +
                "| - Durchführung von korrektiven und präventiven Reparaturen gemäß    |\n" +
                "|   den festgelegten Plänen und Zeitplänen.                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. PRÄVENTIVE REPARATUR:                                            |\n" +
                "|                                                                     |\n" +
                "| - Regelmäßige Inspektion der Transformatoren auf Anzeichen von      |\n" +
                "|   Überhitzung, ungewöhnlichen Geräuschen oder Vibrationen.          |\n" +
                "| - Überprüfung des Zustands von Isolatoren und Ein-/Ausgangsbuchsen. |\n" +
                "| - Durchführung von Isolationswiderstandstests zur Erkennung von     |\n" +
                "|   Fehlern vor einem vollständigen Ausfall.                          |\n" +
                "| - Reinigung der Transformatoren von Staub und Verunreinigungen zur  |\n" +
                "|   Vermeidung von Überhitzung und elektrischen Störungen.            |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. KORREKTIVE REPARATUR:                                            |\n" +
                "|                                                                     |\n" +
                "| - Bei Ausfall eines Transformators muss das Reparaturteam die       |\n" +
                "|   Ursache diagnostizieren und die notwendige Korrektur durchführen. |\n" +
                "| - Austausch beschädigter Komponenten wie Buchsen, Strom- oder       |\n" +
                "|   Spannungswandler und ggf. Kühlsysteme.                            |\n" +
                "| - Durchführung von Tests nach der Reparatur zur Sicherstellung des  |\n" +
                "|   ordnungsgemäßen Betriebs.                                         |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. PRÄDIKTIVE REPARATUR:                                            |\n" +
                "|                                                                     |\n" +
                "| - Einsatz von Zustandsüberwachungstechnologien wie Temperatur- und  |\n" +
                "|   Feuchtigkeitssensoren zur Früherkennung von Fehlern.              |\n" +
                "| - Durchführung von Strom- und Widerstandsmessungen zur Bewertung    |\n" +
                "|   des Zustands und zur Erkennung bevorstehender Ausfälle.           |\n" +
                "| - Detaillierte Aufzeichnung der gesammelten Daten zur Optimierung   |\n" +
                "|   der Wartungsplanung.                                              |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. SICHERHEITSVERFAHREN BEI DER REPARATUR:                          |\n" +
                "|                                                                     |\n" +
                "| - Vor Beginn jeglicher Arbeiten muss die Stromversorgung des        |\n" +
                "|   Transformators unterbrochen werden.                               |\n" +
                "| - Verwendung geeigneter persönlicher Schutzausrüstung (PSA) wie     |\n" +
                "|  isolierende Handschuhe, Helme, Schutzbrillen und Sicherheitsschuhe.|\n" +
                "| - Sicherstellung, dass Sperr- und Kennzeichnungsverfahren befolgt   |\n" +
                "|   werden.                                                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. DOKUMENTATION UND REPARATURPROTOKOLLE:                           |\n" +
                "|                                                                     |\n" +
                "| - Vollständige Dokumentation aller durchgeführten Reparaturen mit   |\n" +
                "|   detaillierter Beschreibung des festgestellten Fehlers und der     |\n" +
                "|   durchgeführten Maßnahme.                                          |\n" +
                "| - Aufzeichnung durchgeführter Tests wie Widerstands- und            |\n" +
                "|   Strommessungen.                                                   |\n" +
                "| - Erstellung von Berichten über aufgetretene Fehler und             |\n" +
                "|   implementierte Korrekturmaßnahmen.                                |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. SCHULUNG UND QUALIFIZIERUNG:                                     |\n" +
                "|                                                                     |\n" +
                "| - Durchführung von Schulungen zu Diagnosetechniken und              |\n" +
                "|   Reparaturverfahren von Transformatoren, einschließlich            |\n" +
                "|   elektrischer Risiken.                                             |\n" +
                "| - Einweisung der Mitarbeiter in Sicherheitsvorschriften und den     |\n" +
                "|   sachgemäßen Gebrauch von Werkzeugen.                              |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. VORGEHEN BEI VORFÄLLEN ODER UNFÄLLEN:                            |\n" +
                "|                                                                     |\n" +
                "| - Bei einem Unfall ist sofort das Sicherheitsteam zu benachrichtigen|\n" +
                "|   und der Vorfall gemäß den internen Vorschriften zu protokollieren.|\n" +
                "| - Durchführung einer Ursachenanalyse und Umsetzung von              |\n" +
                "|   Korrekturmaßnahmen zur Vermeidung zukünftiger Ereignisse.         |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. GELTENDE NORMEN UND VORSCHRIFTEN:                                |\n" +
                "|                                                                     |\n" +
                "| - Einhaltung der NBR-Normen (brasilianische Normen) für             |\n" +
                "|   Sicherheit in elektrischen Systemen und bei Transformatoren.      |\n" +
                "| - Befolgung der Herstellerempfehlungen für Installation, Betrieb    |\n" +
                "|   und Wartung von Transformatoren.                                  |\n" +
                "|_____________________________________________________________________|\n";

        
    }

    public void cadastrarManual() { //cadastro em PT

		if (contadorCadastro < titulosManutencaoReparos.length) {

			System.out.println(tradutor.get("tituloManutenRep"));
			titulosManutencaoReparos[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManutenRep"));
			manutencaoReparos[contadorCadastro] = leia.nextLine();
			System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

			contadorCadastro++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

        public void cadastrarManualEN() { //cadastro em INGLES

		if (contadorCadastroEN < titulosManutencaoReparosEN.length) {

			System.out.println(tradutor.get("tituloManutenRep"));
			titulosManutencaoReparosEN[contadorCadastroEN] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManutenRep"));
			manutencaoReparosEN[contadorCadastroEN] = leia.nextLine();
			System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

			contadorCadastroEN++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

        public void cadastrarManualDE() { //cadastro em ALEMÃO

		if (contadorCadastroDE < titulosManutencaoReparosDE.length) {

			System.out.println(tradutor.get("tituloManutenRep"));
			titulosManutencaoReparosDE[contadorCadastroDE] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManutenRep"));
			manutencaoReparosDE[contadorCadastroDE] = leia.nextLine();
			System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

			contadorCadastroDE++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}





   	public void pesquisaManualTitulo() { //pesquisa TITULO em PT

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

		        if (manutencaoReparos[i] != null) {
				System.out.println(titulosManutencaoReparos[i]);
		        }
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
                String pesquisa = leia.nextLine();

		boolean encontrado = false;

                System.out.println(" ");

		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

			if (titulosManutencaoReparos[i] != null) {

				if (titulosManutencaoReparos[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                                        System.out.println(" ");
					System.out.println(titulosManutencaoReparos[i]);
					System.out.println(manutencaoReparos[i]);
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

        public void pesquisaManualTituloEN() { //pesquisa TITULO em INGLES

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosManutencaoReparosEN.length; i++) {

			if (manutencaoReparosEN[i] != null) {
				System.out.println(titulosManutencaoReparosEN[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
                String pesquisa = leia.nextLine();

		boolean encontrado = false;

                System.out.println(" ");

		for (int i = 0; i < titulosManutencaoReparosEN.length; i++) {

			if (titulosManutencaoReparosEN[i] != null) {

				if (titulosManutencaoReparosEN[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                                        System.out.println(" ");
					System.out.println(titulosManutencaoReparosEN[i]);
					System.out.println(manutencaoReparosEN[i]);
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

        public void pesquisaManualTituloDE() { //pesquisa TITULO em ALEMAO

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosManutencaoReparosDE.length; i++) {

		        if (manutencaoReparosDE[i] != null) {
				System.out.println(titulosManutencaoReparosDE[i]);
		        }
		}

		System.out.println(" ");
                
		System.out.println(tradutor.get("tituloPesq"));
                String pesquisa = leia.nextLine();

		boolean encontrado = false;

                System.out.println(" ");

		for (int i = 0; i < titulosManutencaoReparosDE.length; i++) {

			if (titulosManutencaoReparosDE[i] != null) {

				if (titulosManutencaoReparosDE[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                                        System.out.println(" ");
					System.out.println(titulosManutencaoReparosDE[i]);
					System.out.println(manutencaoReparosDE[i]);
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
		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

			if (manutencaoReparos[i] != null) {
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

		if (titulosManutencaoReparos[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
                        System.out.println(" ");
			System.out.println(titulosManutencaoReparos[pesquisaCodigo]);

			System.out.println(manutencaoReparos[pesquisaCodigo]);
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
		for (int i = 0; i < titulosManutencaoReparosEN.length; i++) {

			if (manutencaoReparosEN[i] != null) {
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
                            System.out.println("Entrada inválida!");
                        }

                    } catch (InputMismatchException e) {
                    
                        System.out.println(tradutor.get("entradaInvalid"));
                        leia.nextLine();
                    }
                }
		
		
		boolean encontrado = false;

                System.out.println(" ");

		if (titulosManutencaoReparosEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
                        System.out.println(" ");
			System.out.println(titulosManutencaoReparosEN[pesquisaCodigo]);

			System.out.println(manutencaoReparosEN[pesquisaCodigo]);
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
		for (int i = 0; i < titulosManutencaoReparosDE.length; i++) {

			if (manutencaoReparosDE[i] != null) {
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

		if (titulosManutencaoReparosDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
                        System.out.println(" ");
			System.out.println(titulosManutencaoReparosDE[pesquisaCodigo]);

			System.out.println(manutencaoReparosDE[pesquisaCodigo]);
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
		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

			if (manutencaoReparos[i] != null) {
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

		if (titulosManutencaoReparos[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManutencaoReparos[indiceCadastro] = leia.nextLine();
			titulosManutencaoReparos[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manutencaoReparos[indiceCadastro] = leia.nextLine();

                        System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

        public void editarManualEN() { //editar em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManutencaoReparosEN.length; i++) {

			if (manutencaoReparosEN[i] != null) {
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

		if (titulosManutencaoReparosEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManutencaoReparosEN[indiceCadastro] = leia.nextLine();
			titulosManutencaoReparosEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manutencaoReparosEN[indiceCadastro] = leia.nextLine();

                        System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

        public void editarManualDE() { //editar em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManutencaoReparosDE.length; i++) {

			if (manutencaoReparosDE[i] != null) {
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

		if (titulosManutencaoReparosDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManutencaoReparosDE[indiceCadastro] = leia.nextLine();
			titulosManutencaoReparosDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manutencaoReparosDE[indiceCadastro] = leia.nextLine();

                        System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}





        public void excluirManual() { //excluir em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

			if (manutencaoReparos[i] != null) {
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
            
		if (titulosManutencaoReparos[indiceCadastro] != null) {

                        for (int i = codigo; i < 3; i++) {

                        titulosManutencaoReparos[i] = titulosManutencaoReparos[i + 1];
                        manutencaoReparos[i] = manutencaoReparos[i + 1];

                        }

                titulosManutencaoReparos[3] = null;
                manutencaoReparos[3] = null;

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
		for (int i = 0; i < titulosManutencaoReparosEN.length; i++) {

			if (manutencaoReparosEN[i] != null) {
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

		if (titulosManutencaoReparosEN[indiceCadastro] != null) {

                        for (int i = codigo; i < 3; i++) {

                        titulosManutencaoReparosEN[i] = titulosManutencaoReparosEN[i + 1];
                        manutencaoReparosEN[i] = manutencaoReparosEN[i + 1];

                        }

                titulosManutencaoReparosEN[3] = null;
                manutencaoReparosEN[3] = null;

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
		for (int i = 0; i < titulosManutencaoReparosDE.length; i++) {

			if (manutencaoReparosDE[i] != null) {
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

		if (titulosManutencaoReparosDE[indiceCadastro] != null) {

                        for (int i = codigo; i < 3; i++) {

                        titulosManutencaoReparosDE[i] = titulosManutencaoReparosDE[i + 1];
                        manutencaoReparosDE[i] = manutencaoReparosDE[i + 1];

                        }

                titulosManutencaoReparosDE[3] = null;
                manutencaoReparosDE[3] = null;

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