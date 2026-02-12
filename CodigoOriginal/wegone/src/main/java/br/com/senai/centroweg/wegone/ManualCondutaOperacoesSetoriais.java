package br.com.senai.centroweg.wegone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManualCondutaOperacoesSetoriais {
       
    Scanner leia = new Scanner(System.in);
    
    Traducoes tradutor;

    String[] manualCOSConteudo = new String[4];
	String[] titulosManuaisCOS = new String[4];

    String[] manualCOSConteudoEN = new String[4];
	String[] titulosManuaisCOSEN = new String[4];

    String[] manualCOSConteudoDE = new String[4];
	String[] titulosManuaisCOSDE = new String[4];

    int contadorCadastro = 2;
    int contadorCadastroEN = 2;
	int contadorCadastroDE = 2;
    int pesquisaCodigo;
    int indiceCadastro;
    int codigo;

    public ManualCondutaOperacoesSetoriais(Traducoes tradutor) {

        this.tradutor = tradutor;

        //manuais em PT
        titulosManuaisCOS[0] = "Conduta no setor de montagem";
        
        manualCOSConteudo[0] =
                    "___________________________________________________________________________\n" +
                    "|--   OBJETIVO: Estabelecer as diretrizes e normas de conduta para      --|\n" +
                    "|    todos os colaboradores envolvidos no setor de montagem da WEG        |\n" +
                    "|_________________________________________________________________________|\n" +
                    "|                                                                         |\n" +
                    "| 1. CÓDIGO DE ÉTICA E CONDUTA:                                           |\n" +
                    "|                                                                         |\n" +
                    "| - Cada colaborador é responsável por sua área de atuação, e deve        |\n" +
                    "|   garantir que a montagem seja realizada conforme os padrões de         |\n" +
                    "|   qualidade e segurança.                                                |\n" +
                    "| - Honestidade, respeito e integridade são valores indispensáveis.       |\n" +
                    "| - Todos os documentos e informações relacionadas ao projeto             |\n" +
                    "|   são confidenciais, e não devem ser compartilhados com pessoas         |\n" +
                    "|   externas à empresa.                                                   |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 2. SEGURANÇA NO TRABALHO:                                               |\n" +
                    "|                                                                         |\n" +
                    "| - O uso de EPIs adequados é obrigatório em todas as atividades de       |\n" +
                    "|   montagem.                                                             |\n" +
                    "| - Qualquer situação de risco deve ser imediatamente reportada ao        |\n" +
                    "|   supervisor.                                                           |\n" +
                    "| - Nunca realizar qualquer tarefa sem análise prévia dos                 |\n" +
                    "|   riscos envolvidos.                                                    |\n" +
                    "| - Informar ao setor de manutenção caso um equipamento apresente         |\n" +
                    "|   defeito ou esteja em situações inadequadas de uso.                    |\n" +
                    "| - Os equipamentos devem ser mantidos em boas condições de uso, com      |\n" +
                    "|   inspeções regulares.                                                  |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 3. QUALIDADE:                                                           |\n" +
                    "|                                                                         |\n" +
                    "| - Todos os produtos montados devem atender aos padrões de qualidade     |\n" +
                    "|   da WEG.                                                               |\n" +
                    "| - É obrigatório seguir as instruções de montagem, manuais técnicos      |\n" +
                    "|   e procedimentos operacionais padrão (POPs) em todas as atividades.    |\n" +
                    "| - O setor de montagem deve participar ativamente das iniciativas        |\n" +
                    "|   de melhoria contínua.                                                 |\n" +
                    "| - A qualidade deve ser verificada em cada etapa da montagem.            |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 4. COMPORTAMENTO NO AMBIENTE DE TRABALHO:                               |\n" +
                    "|                                                                         |\n" +
                    "| - Todos os colaboradores devem manter o respeito e colaboração entre si.|\n" +
                    "| - A comunicação deve ser clara, precisa e eficiente.                    |\n" +
                    "| - Os colaboradores devem cumprir com os horários estabelecidos.         |\n" +
                    "| - Em caso de ausência, o colaborador deve avisar o seu superior         |\n" +
                    "|   com antecedência.                                                     |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 5. RESPONSABILIDADE AMBIENTAL:                                          |\n" +
                    "|                                                                         |\n" +
                    "| - Todos os resíduos gerados devem ser descartados corretamente.         |\n" +
                    "| - O uso consciente de recursos como energia e água é fundamental        |\n" +
                    "|   para a sustentabilidade.                                              |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 6. TREINAMENTO E DESENVOLVIMENTO:                                       |\n" +
                    "|                                                                         |\n" +
                    "| - Todos os colaboradores devem participar de treinamentos contínuos     |\n" +
                    "|   para melhorar suas habilidades.                                       |\n" +
                    "| - A capacitação é um processo constante, com foco na melhoria           |\n" +
                    "|   dos processos e operações.                                            |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 7. PROCEDIMENTOS EM CASO DE INCIDENTES OU NÃO CONFORMIDADES:            |\n" +
                    "|                                                                         |\n" +
                    "| - Relatar qualquer incidente imediatamente ao supervisor.               |\n" +
                    "| - Adotar as ações corretivas e preventivas necessárias para garantir    |\n" +
                    "|   que a falha não se repita.                                            |\n" +
                    "|-------------------------------------------------------------------------|\n" +
                    "|                                                                         |\n" +
                    "| 8. NORMAS APLICADAS:                                                    |\n" +
                    "|                                                                         |\n" +
                    "| - Normas técnicas nacionais e internacionais relevantes.                |\n" +
                    "| - Recomendações do fabricante para equipamentos industriais.            |\n" +
                    "|_________________________________________________________________________|\n";
       

        titulosManuaisCOS[1] = "Procedimentos Operacionais no Setor de Manutencao";

        manualCOSConteudo[1] =
                "____________________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão para      --|\n" +
                "|    o setor de manutenção da WEG, garantindo a eficiência e a segurança   |\n" +
                "|__________________________________________________________________________|\n" +
                "|                                                                          |\n" +
                "| 1. OBJETIVO DO SETOR DE MANUTENÇÃO:                                      |\n" +
                "|                                                                          |\n" +
                "| - Garantir a operação contínua e segura dos equipamentos e sistemas      |\n" +
                "|   da WEG.                                                                |\n" +
                "| - Realizar manutenção preventiva, corretiva e preditiva de acordo com    |\n" +
                "|   os planos e cronogramas estabelecidos.                                 |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 2. MANUTENÇÃO PREVENTIVA:                                                |\n" +
                "|                                                                          |\n" +
                "| - Realizar inspeções regulares em todos os equipamentos e sistemas.      |\n" +
                "| - Seguir os cronogramas de manutenção preventiva, conforme o manual      |\n" +
                "|   do fabricante.                                                         |\n" +
                "| - Lubrificação dos componentes conforme especificado no manual de        |\n" +
                "|   operação e manutenção.                                                 |\n" +
                "| - Verificar e substituir filtros, correias, rolamentos, etc., conforme   |\n" +
                "|   necessário, para evitar falhas futuras.                                |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 3. MANUTENÇÃO CORRETIVA:                                                 |\n" +
                "|                                                                          |\n" +
                "| - Quando ocorrer falha ou defeito em algum equipamento, o setor de       |\n" +
                "|   manutenção deverá realizar a análise do problema, elaborar um          |\n" +
                "|   plano de reparo e corrigir a falha com a maior rapidez possível.       |\n" +
                "| - Após a correção, realizar testes para garantir o funcionamento         |\n" +
                "|   correto do equipamento.                                                |\n" +
                "| - Documentar o defeito e o procedimento de reparo, para futuras          |\n" +
                "|   referências e controle.                                                |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 4. MANUTENÇÃO PREDITIVA:                                                 |\n" +
                "|                                                                          |\n" +
                "| - Utilizar técnicas de monitoramento de condição (como termografia,      |\n" +
                "|   vibração e ultrassom) para identificar potenciais falhas antes         |\n" +
                "|   que ocorram.                                                           |\n" +
                "| - Implementar tecnologias de análise preditiva para otimizar as          |\n" +
                "|   intervenções de manutenção e reduzir os tempos de inatividade.         |\n" +
                "| - Manter registros detalhados dos dados coletados para análise e         |\n" +
                "|   previsão de falhas futuras.                                            |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NA MANUTENÇÃO:                             |\n" +
                "|                                                                          |\n" +
                "| - Desligar e isolar as fontes de energia antes de realizar qualquer      |\n" +
                "|   intervenção em equipamentos.                                           |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados para     |\n" +
                "|   cada tipo de tarefa, como luvas, óculos, capacetes, protetores         |\n" +
                "|   auditivos e calçados de segurança.                                     |\n" +
                "| - Assegurar que todas as ferramentas e dispositivos utilizados estejam   |\n" +
                "|   em boas condições de uso e seguiam as normas de segurança.             |\n" +
                "| - Em caso de necessidade de intervenções em áreas de risco, seguir       |\n" +
                "|   as normas específicas de segurança para o trabalho em altura, em       |\n" +
                "|   espaços confinados ou com risco elétrico.                              |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE MANUTENÇÃO:                               |\n" +
                "|                                                                          |\n" +
                "| - Manter um registro atualizado de todas as atividades de manutenção,    |\n" +
                "|   incluindo a data, descrição do serviço realizado e peças trocadas.     |\n" +
                "| - Os registros devem ser armazenados de forma organizada e de fácil      |\n" +
                "|   acesso, para futuras auditorias ou referência.                         |\n" +
                "| - Elaborar relatórios de falhas, identificando a causa raiz e as         |\n" +
                "|   ações corretivas aplicadas.                                            |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                            |\n" +
                "|                                                                          |\n" +
                "| - Todos os colaboradores do setor de manutenção devem participar de      |\n" +
                "|   treinamentos periódicos sobre novas tecnologias, procedimentos e       |\n" +
                "|   normas de segurança.                                                   |\n" +
                "| - A WEG oferece programas de treinamento contínuo para garantir que      |\n" +
                "|   os colaboradores estejam sempre atualizados com as melhores            |\n" +
                "|   práticas de manutenção e segurança.                                    |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                     |\n" +
                "|                                                                          |\n" +
                "| - Caso ocorra qualquer tipo de acidente durante a manutenção, o          |\n" +
                "|   colaborador deverá imediatamente acionar o supervisor e a equipe       |\n" +
                "|   de segurança, além de registrar o incidente conforme os                |\n" +
                "|   procedimentos internos.                                                |\n" +
                "| - Realizar uma análise do incidente para identificar suas causas e       |\n" +
                "|   implementar ações corretivas para prevenir ocorrências semelhantes.    |\n" +
                "|--------------------------------------------------------------------------|\n" +
                "|                                                                          |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                     |\n" +
                "|                                                                          |\n" +
                "| - Seguir todas as normas técnicas nacionais e internacionais relacionadas|\n" +
                "|   à segurança e manutenção de equipamentos industriais.                  |\n" +
                "| - Cumprir as orientações do fabricante quanto ao uso e manutenção        |\n" +
                "|   dos equipamentos.                                                      |\n" +
                "|__________________________________________________________________________|\n";


        //manuais em INGLES
        titulosManuaisCOSEN[0] = "Conduct in the Assembly Department";

        manualCOSConteudoEN[0] =
                    "_________________________________________________________________________\n" +
                    "|-- OBJECTIVE: Establish the guidelines and conduct standards for     --|\n" +
                    "|    all employees involved in the assembly department at WEG.          |\n" +
                    "|_______________________________________________________________________|\n" +
                    "|                                                                       |\n" +
                    "| 1. CODE OF ETHICS AND CONDUCT:                                        |\n" +
                    "|                                                                       |\n" +
                    "| - Each employee is responsible for their area of work and must        |\n" +
                    "|   ensure that the assembly is performed according to quality and      |\n" +
                    "|   safety standards.                                                   |\n" +
                    "| - Honesty, respect, and integrity are essential values.               |\n" +
                    "| - All documents and information related to the project are            |\n" +
                    "|   confidential and should not be shared with people outside the       |\n" +
                    "|   company.                                                            |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 2. WORKPLACE SAFETY:                                                  |\n" +
                    "|                                                                       |\n" +
                    "| - The use of appropriate PPE is mandatory for all assembly activities.|\n" +
                    "| - Any safety risk situation must be immediately reported to the       |\n" +
                    "|   supervisor.                                                         |\n" +
                    "| - Never perform any task without a prior risk assessment.             |\n" +
                    "| - Report to the maintenance department if any equipment is faulty     |\n" +
                    "|   or inappropriately used.                                            |\n" +
                    "| - Equipment should be kept in good working condition with regular     |\n" +
                    "|   inspections.                                                        |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 3. QUALITY:                                                           |\n" +
                    "|                                                                       |\n" +
                    "| - All assembled products must meet WEG’s quality standards.           |\n" +
                    "| - It is mandatory to follow assembly instructions, technical manuals, |\n" +
                    "|   and standard operating procedures (SOPs) in all activities.         |\n" +
                    "| - The assembly department must actively participate in continuous     |\n" +
                    "|   improvement initiatives.                                            |\n" +
                    "| - Quality must be checked at each stage of the assembly process.      |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 4. BEHAVIOR IN THE WORKPLACE:                                         |\n" +
                    "|                                                                       |\n" +
                    "| - All employees should maintain respect and collaboration with one    |\n" +
                    "|  another.                                                             |\n" +
                    "| - Communication should be clear, accurate, and efficient.             |\n" +
                    "| - Employees must adhere to the established schedules.                 |\n" +
                    "| - In case of absence, the employee must notify their supervisor in    |\n" +
                    "|   advance.                                                            |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 5. ENVIRONMENTAL RESPONSIBILITY:                                      |\n" +
                    "|                                                                       |\n" +
                    "| - All generated waste must be disposed of properly.                   |\n" +
                    "| - The conscious use of resources such as energy and water is          |\n" +
                    "|   crucial for sustainability.                                         |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 6. TRAINING AND DEVELOPMENT:                                          |\n" +
                    "|                                                                       |\n" +
                    "| - All employees must participate in ongoing training to improve       |\n" +
                    "|   their skills.                                                       |\n" +
                    "| - Training is an ongoing process focused on improving processes and   |\n" +
                    "|   operations.                                                         |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 7. PROCEDURES IN CASE OF INCIDENTS OR NON-CONFORMITIES:               |\n" +
                    "|                                                                       |\n" +
                    "| - Report any incidents immediately to the supervisor.                 |\n" +
                    "| - Implement corrective and preventive actions to ensure that the      |\n" +
                    "|   failure does not recur.                                             |\n" +
                    "|-----------------------------------------------------------------------|\n" +
                    "|                                                                       |\n" +
                    "| 8. APPLICABLE STANDARDS:                                              |\n" +
                    "|                                                                       |\n" +
                    "| - Relevant national and international technical standards.            |\n" +
                    "| - Manufacturer recommendations for industrial equipment.              |\n" +
                    "|-----------------------------------------------------------------------|\n";


        titulosManuaisCOSEN[1] = "Operational Procedures in the Maintenance Department";

        manualCOSConteudoEN[1] =
                "_______________________________________________________________________\n" +
                "|-- OBJECTIVE: Establish the standard operating procedures for the  --|\n" +
                "|   maintenance department at WEG, ensuring efficiency and safety.    |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. MAINTENANCE DEPARTMENT OBJECTIVE:                                |\n" +
                "|                                                                     |\n" +
                "| - Ensure the continuous and safe operation of WEG’s equipment and   |\n" +
                "|   systems.                                                          |\n" +
                "| - Perform preventive, corrective, and predictive maintenance        |\n" +
                "|   according to the established plans and schedules.                 |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. PREVENTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - Perform regular inspections of all equipment and systems.         |\n" +
                "| - Follow preventive maintenance schedules as per the manufacturer's |\n" +
                "|   manual.                                                           |\n" +
                "| - Lubricate components as specified in the operation and            |\n" +
                "|   maintenance manual.                                               |\n" +
                "| - Inspect and replace filters, belts, bearings, etc., as needed to  |\n" +
                "|   prevent future failures.                                          |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. CORRECTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - When a failure or defect occurs in any equipment, the maintenance |\n" +
                "|   department must analyze the problem, develop a repair plan, and   |\n" +
                "|   correct the failure as quickly as possible.                       |\n" +
                "| - After correction, conduct tests to ensure proper equipment        |\n" +
                "|   operation.                                                        |\n" +
                "| - Document the defect and the repair procedure for future           |\n" +
                "|   reference and control.                                            |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. PREDICTIVE MAINTENANCE:                                          |\n" +
                "|                                                                     |\n" +
                "| - Use condition monitoring techniques (such as thermography,        |\n" +
                "|   vibration, and ultrasound) to identify potential failures before  |\n" +
                "|   they occur.                                                       |\n" +
                "| - Implement predictive analysis technologies to optimize            |\n" +
                "|   maintenance interventions and reduce downtime.                    |\n" +
                "| - Maintain detailed records of collected data for analysis and      |\n" +
                "|   failure forecasting.                                              |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. SAFETY PROCEDURES IN MAINTENANCE:                                |\n" +
                "|                                                                     |\n" +
                "| - Disconnect and isolate energy sources before performing any       |\n" +
                "|   intervention on equipment.                                        |\n" +
                "| - Use appropriate Personal Protective Equipment (PPE) for each      |\n" +
                "|   type of task, such as gloves, goggles, helmets, hearing           |\n" +
                "|   protection, and safety footwear.                                  |\n" +
                "| - Ensure all tools and devices used are in good working condition   |\n" +
                "|   and comply with safety standards.                                 |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. MAINTENANCE DOCUMENTATION AND RECORDS:                           |\n" +
                "|                                                                     |\n" +
                "| - Keep an updated record of all maintenance activities, including   |\n" +
                "|   date, description of service performed, and parts replaced.       |\n" +
                "| - Records should be stored in an organized and easily accessible    |\n" +
                "|   way for future audits or references.                              |\n" +
                "| - Prepare failure reports, identifying the root cause and           |\n" +
                "|   corrective actions taken.                                         |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. TRAINING AND CAPACITY BUILDING:                                  |\n" +
                "|                                                                     |\n" +
                "| - All maintenance employees should participate in periodic training |\n" +
                "|   on new technologies, procedures, and safety standards.            |\n" +
                "| - WEG provides continuous training programs to ensure employees     |\n" +
                "|   are always up to date with best maintenance and safety practices. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. PROCEDURES IN CASE OF INCIDENTS OR ACCIDENTS:                    |\n" +
                "|                                                                     |\n" +
                "| - If an accident occurs during maintenance, the employee must       |\n" +
                "|   immediately notify the supervisor and safety team, and document   |\n" +
                "|   the incident according to internal procedures.                    |\n" +
                "| - Analyze the incident to identify causes and implement corrective  |\n" +
                "|   actions to prevent similar occurrences.                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. APPLICABLE STANDARDS AND REGULATIONS:                            |\n" +
                "|                                                                     |\n" +
                "| - Follow all relevant national and international technical          |\n" +
                "|   standards regarding safety and maintenance of industrial          |\n" +
                "|   equipment.                                                        |\n" +
                "| - Adhere to the manufacturer's guidelines for equipment use and     |\n" +
                "|   maintenance.                                                      |\n" +
                "|_____________________________________________________________________|\n";


            
            //manuais em ALEMÃO
            titulosManuaisCOSDE[0] = "Verhalten im Montagebereich";
            manualCOSConteudoDE[0] = 
                "_______________________________________________________________________\n" +
                "|--ZIEL: Festlegung der Richtlinien und Verhaltensstandards für alle--|\n" +
                "|   Mitarbeiter im Montagebereich von WEG                             |\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. ETHIK- UND VERHALTENSKODEX:                                      |\n" +
                "|                                                                     |\n" +
                "| - Jeder Mitarbeiter ist für seinen Arbeitsbereich verantwortlich    |\n" +
                "|   und muss sicherstellen, dass die Montage gemäß den Qualitäts-     |\n" +
                "|   und Sicherheitsstandards durchgeführt wird.                       |\n" +
                "| - Ehrlichkeit, Respekt und Integrität sind wesentliche Werte.       |\n" +
                "| - Alle projektbezogenen Dokumente und Informationen sind            |\n" +
                "|   vertraulich und dürfen nicht mit externen Parteien geteilt        |\n" +
                "|   werden.                                                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. SICHERHEIT AM ARBEITSPLATZ:                                      |\n" +
                "|                                                                     |\n" +
                "| - Das Tragen der entsprechenden PSA (Persönliche Schutzausrüstung)  |\n" +
                "|   ist bei allen Montageaktivitäten obligatorisch.                   |\n" +
                "| - Jede Risikosituation muss sofort dem Vorgesetzten gemeldet        |\n" +
                "|   werden.                                                           |\n" +
                "| - Keine Aufgabe ohne vorherige Risikobewertung durchführen.         |\n" +
                "| - Defekte oder unsachgemäße Nutzung von Geräten müssen sofort dem   |\n" +
                "|   Wartungsteam gemeldet werden.                                     |\n" +
                "| - Geräte müssen in gutem Zustand gehalten und regelmäßig            |\n" +
                "|   inspiziert werden.                                                |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. QUALITÄT:                                                        |\n" +
                "|                                                                     |\n" +
                "| - Alle montierten Produkte müssen den Qualitätsstandards von WEG    |\n" +
                "|   entsprechen.                                                      |\n" +
                "| - Es ist obligatorisch, Montageanleitungen, technische Handbücher   |\n" +
                "|   und Standardarbeitsanweisungen (SOPs) in allen Aktivitäten zu     |\n" +
                "|   befolgen.                                                         |\n" +
                "| - Der Montagebereich muss aktiv an kontinuierlichen                 |\n" +
                "|   Verbesserungsinitiativen teilnehmen.                              |\n" +
                "| - Qualität muss in jeder Phase der Montage überprüft werden.        |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. VERHALTEN AM ARBEITSPLATZ:                                       |\n" +
                "|                                                                     |\n" +
                "| - Alle Mitarbeiter müssen Respekt und Zusammenarbeit untereinander  |\n" +
                "|   wahren.                                                           |\n" +
                "| - Kommunikation sollte klar, präzise und effizient sein.            |\n" +
                "| - Mitarbeiter müssen die festgelegten Arbeitszeiten einhalten.      |\n" +
                "| - Im Falle einer Abwesenheit muss der Mitarbeiter seinen            |\n" +
                "|   Vorgesetzten rechtzeitig benachrichtigen.                         |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. UMWELTVERANTWORTUNG:                                             |\n" +
                "|                                                                     |\n" +
                "| - Alle Abfälle müssen ordnungsgemäß entsorgt werden.                |\n" +
                "| - Der bewusste Umgang mit Ressourcen wie Energie und Wasser ist     |\n" +
                "|   entscheidend für die Nachhaltigkeit.                              |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. SCHULUNG UND ENTWICKLUNG:                                        |\n" +
                "|                                                                     |\n" +
                "| - Alle Mitarbeiter müssen an kontinuierlichen Schulungen            |\n" +
                "|   teilnehmen, um ihre Fähigkeiten zu verbessern.                    |\n" +
                "| - Weiterbildung ist ein kontinuierlicher Prozess, der auf die       |\n" +
                "|   Verbesserung von Prozessen und Abläufen abzielt.                  |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. VERFAHREN BEI ZWISCHENFÄLLEN ODER NICHT-ÜBEREINSTIMMUNGEN:       |\n" +
                "|                                                                     |\n" +
                "| - Alle Vorfälle müssen sofort dem Vorgesetzten gemeldet werden.     |\n" +
                "| - Korrektur- und Präventivmaßnahmen müssen ergriffen werden, um     |\n" +
                "|   sicherzustellen, dass der Fehler nicht wiederholt wird.           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. ANWENDBARE VORSCHRIFTEN UND NORMEN:                              |\n" +
                "|                                                                     |\n" +
                "| - Relevante nationale und internationale technische Normen.         |\n" +
                "| - Empfehlungen des Herstellers für industrielle Geräte.             |\n" +
                "|_____________________________________________________________________|\n";


            titulosManuaisCOSDE[1] = "Betriebsverfahren im Wartungsbereich";
            manualCOSConteudoDE[1] = 
                "_________________________________________________________________________\n" +
                "|--ZIEL:Festlegung der Standardbetriebsverfahren für den Wartungsbereich|\n" +
                "|   von WEG, um Effizienz und Sicherheit zu gewährleisten.              |\n" +
                "|_______________________________________________________________________|\n" +
                "|                                                                       |\n" +
                "| 1. ZIEL DES WARTUNGSBEREICHS:                                         |\n" +
                "|                                                                       |\n" +
                "| - Sicherstellen des kontinuierlichen und sicheren Betriebs der        |\n" +
                "|   Geräte und Systeme von WEG.                                         |\n" +
                "| - Durchführung von präventiver, korrektiver und prädiktiver           |\n" +
                "|   Wartung nach den festgelegten Plänen und Zeitplänen.                |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 2. PRÄVENTIVE WARTUNG:                                                |\n" +
                "|                                                                       |\n" +
                "| - Regelmäßige Inspektionen aller Geräte und Systeme durchführen.      |\n" +
                "| - Einhaltung der Wartungspläne gemäß den Anweisungen des              |\n" +
                "|   Herstellers.                                                        |\n" +
                "| - Schmierung der Komponenten gemäß den Spezifikationen des            |\n" +
                "|   Betriebs- und Wartungshandbuchs.                                    |\n" +
                "| - Überprüfung und Austausch von Filtern, Riemen, Lagern usw.,         |\n" +
                "|   nach Bedarf, um zukünftige Fehler zu vermeiden.                     |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 3. KORREKTIVE WARTUNG:                                                |\n" +
                "|                                                                       |\n" +
                "| - Bei einem Fehler oder Defekt eines Geräts muss die                  |\n" +
                "|   Wartungsabteilung das Problem analysieren, einen Reparaturplan      |\n" +
                "|   erstellen und den Fehler schnellstmöglich beheben.                  |\n" +
                "| - Nach der Behebung muss ein Test durchgeführt werden, um sicher-     |\n" +
                "|   zustellen, dass das Gerät ordnungsgemäß funktioniert.               |\n" +
                "| - Der Defekt und das Reparaturverfahren müssen für zukünftige         |\n" +
                "|   Referenzen und die Kontrolle dokumentiert werden.                   |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 4. PRÄDIKTIVE WARTUNG:                                                |\n" +
                "|                                                                       |\n" +
                "| - Nutzung von Zustandsüberwachungstechniken (wie Thermografie,        |\n" +
                "|   Vibration und Ultraschall), um potenzielle Fehler zu identifizieren,|\n" +
                "|   bevor sie auftreten.                                                |\n" +
                "| - Implementierung prädiktiver Analysetechnologien zur Optimierung     |\n" +
                "|   von Wartungsinterventionen und Reduzierung von Ausfallzeiten.       |\n" +
                "| - Detaillierte Aufzeichnung der gesammelten Daten zur Analyse und     |\n" +
                "|   Vorhersage von zukünftigen Fehlern.                                 |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 5. SICHERHEITSVERFAHREN BEI DER WARTUNG:                              |\n" +
                "|                                                                       |\n" +
                "| - Trennen und Isolieren der Energiequellen vor der Durchführung       |\n" +
                "|   von Arbeiten an Geräten.                                            |\n" +
                "| - Verwendung von geeigneter Persönlicher Schutzausrüstung (PSA)       |\n" +
                "|   für jede Aufgabe, wie Handschuhe, Schutzbrillen, Helme,             |\n" +
                "|   Gehörschutz und Sicherheitsschuhe.                                  |\n" +
                "| - Sicherstellen, dass alle verwendeten Werkzeuge und Geräte in        |\n" +
                "|   einwandfreiem Zustand und gemäß den Sicherheitsstandards sind.      |\n" +
                "| - Wenn Eingriffe in Risikobereichen erforderlich sind, müssen         |\n" +
                "|   spezifische Sicherheitsvorschriften für Arbeiten in der Höhe, in    |\n" +
                "|   engen Räumen oder mit elektrischen Gefahren beachtet werden.        |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 6. DOKUMENTATION UND WARTUNGSUNTERLAGEN:                              |\n" +
                "|                                                                       |\n" +
                "| - Einhaltung eines aktuellen Protokolls für alle Wartungsaktivitäten, |\n" +
                "|   einschließlich Datum, Beschreibung des ausgeführten Dienstes und    |\n" +
                "|   ausgetauschter Teile.                                               |\n" +
                "| - Die Aufzeichnungen müssen organisiert und leicht zugänglich         |\n" +
                "|   aufbewahrt werden, für zukünftige Audits oder Referenzen.           |\n" +
                "| - Fehlerberichte erstellen, die die Ursachenanalyse und die           |\n" +
                "|   angewandten Korrekturmaßnahmen identifizieren.                      |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 7. SCHULUNG UND QUALIFIKATION:                                        |\n" +
                "|                                                                       |\n" +
                "| - Alle Wartungsmitarbeiter sollten an regelmäßigen Schulungen zu      |\n" +
                "|   neuen Technologien, Verfahren und Sicherheitsstandards              |\n" +
                "|   teilnehmen.                                                         |\n" +
                "| - WEG bietet kontinuierliche Schulungsprogramme, um sicherzustellen,  |\n" +
                "|   dass die Mitarbeiter stets mit den besten Wartungs- und             |\n" +
                "|   Sicherheitspraktiken vertraut sind.                                 |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 8. VERFAHREN BEI UNFÄLLEN ODER ZWISCHENFÄLLEN:                        |\n" +
                "|                                                                       |\n" +
                "| - Sollte ein Unfall während der Wartung auftreten, muss der           |\n" +
                "|   Mitarbeiter sofort den Vorgesetzten und das Sicherheitsteam         |\n" +
                "|   benachrichtigen und den Vorfall gemäß den internen Verfahren        |\n" +
                "|   dokumentieren.                                                      |\n" +
                "| - Eine Analyse des Vorfalls muss durchgeführt werden, um dessen       |\n" +
                "|   Ursachen zu identifizieren und Korrekturmaßnahmen zu ergreifen,     |\n" +
                "|   um ähnliche Vorfälle zu verhindern.                                 |\n" +
                "|-----------------------------------------------------------------------|\n" +
                "|                                                                       |\n" +
                "| 9. ANWENDBARE VORSCHRIFTEN UND NORMEN:                                |\n" +
                "|                                                                       |\n" +
                "| - Einhaltung aller relevanten nationalen und internationalen          |\n" +
                "|   technischen Normen bezüglich der Sicherheit und Wartung von         |\n" +
                "|   Industrieanlagen.                                                   |\n" +
                "| - Befolgung der Empfehlungen des Herstellers für den Einsatz und      |\n" +
                "|   die Wartung von Geräten.                                            |\n" +
                "|_______________________________________________________________________|\n";

        }

   public void cadastrarManual() { //cadastro em PT

		if (contadorCadastro < titulosManuaisCOS.length) {

			System.out.println(tradutor.get("tituloManualCOS"));
			titulosManuaisCOS[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualCOS"));
			manualCOSConteudo[contadorCadastro] = leia.nextLine();
			System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

			contadorCadastro++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

    public void cadastrarManualEN() { //cadastro em INGLES

		if (contadorCadastroEN < titulosManuaisCOSEN.length) {

			System.out.println(tradutor.get("tituloManualCOS"));
			titulosManuaisCOSEN[contadorCadastroEN] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualCOS"));
			manualCOSConteudoEN[contadorCadastroEN] = leia.nextLine();
			System.out.println(" ");

            System.out.println(tradutor.get("cadastroSucesso"));
            System.out.println(" ");

			contadorCadastroEN++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

    public void cadastrarManualDE() { //cadastro em ALEMÃO

		if (contadorCadastroDE < titulosManuaisCOSDE.length) {

			System.out.println(tradutor.get("tituloManualCOS"));
			titulosManuaisCOSDE[contadorCadastroDE] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualCOS"));
			manualCOSConteudoDE[contadorCadastroDE] = leia.nextLine();
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
		for (int i = 0; i < titulosManuaisCOS.length; i++) {

			if (manualCOSConteudo[i] != null) {
				System.out.println(titulosManuaisCOS[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

        System.out.println(" ");

		for (int i = 0; i < titulosManuaisCOS.length; i++) {

			if (titulosManuaisCOS[i] != null) {

				if (titulosManuaisCOS[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
					System.out.println(titulosManuaisCOS[i]);
					System.out.println(manualCOSConteudo[i]);
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
		for (int i = 0; i < titulosManuaisCOSEN.length; i++) {

			if (manualCOSConteudoEN[i] != null) {
				System.out.println(titulosManuaisCOSEN[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

        System.out.println(" ");

		for (int i = 0; i < titulosManuaisCOSEN.length; i++) {

			if (titulosManuaisCOSEN[i] != null) {

				if (titulosManuaisCOSEN[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
					System.out.println(titulosManuaisCOSEN[i]);
					System.out.println(manualCOSConteudoEN[i]);
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

    public void pesquisaManualTituloDE() { //pesquisa TITULO em ALEMÃO

		System.out.println(tradutor.get("titulosCad"));
		for (int i = 0; i < titulosManuaisCOSDE.length; i++) {

			if (manualCOSConteudoDE[i] != null) {
				System.out.println(titulosManuaisCOSDE[i]);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

        System.out.println(" ");

		for (int i = 0; i < titulosManuaisCOSDE.length; i++) {

			if (titulosManuaisCOSDE[i] != null) {

				if (titulosManuaisCOSDE[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
					System.out.println(titulosManuaisCOSDE[i]);
					System.out.println(manualCOSConteudoDE[i]);
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
		for (int i = 0; i < titulosManuaisCOS.length; i++) {

			if (manualCOSConteudo[i] != null) {
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

		if (titulosManuaisCOS[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
			System.out.println(titulosManuaisCOS[pesquisaCodigo]);

			System.out.println(manualCOSConteudo[pesquisaCodigo]);
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
		for (int i = 0; i < titulosManuaisCOSEN.length; i++) {

			if (manualCOSConteudoEN[i] != null) {
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

		if (titulosManuaisCOSEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
			System.out.println(titulosManuaisCOSEN[pesquisaCodigo]);

			System.out.println(manualCOSConteudoEN[pesquisaCodigo]);
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
    
    public void pesquisaManualCodigoDE() { //pesquisa CODIGO em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisCOSDE.length; i++) {

			if (manualCOSConteudoDE[i] != null) {
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

		if (titulosManuaisCOSDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
			System.out.println(titulosManuaisCOSDE[pesquisaCodigo]);

			System.out.println(manualCOSConteudoDE[pesquisaCodigo]);
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
		for (int i = 0; i < titulosManuaisCOS.length; i++) {

			if (manualCOSConteudo[i] != null) {
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

		if (titulosManuaisCOS[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisCOS[indiceCadastro] = leia.nextLine();
			titulosManuaisCOS[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualCOSConteudo[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

    public void editarManualEN() { //editar em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisCOSEN.length; i++) {

			if (manualCOSConteudoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
		int codigo = leia.nextInt();

		 while (true) {
                try {
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

		if (titulosManuaisCOSEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisCOSEN[indiceCadastro] = leia.nextLine();
			titulosManuaisCOSEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualCOSConteudoEN[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

    public void editarManualDE() { //editar em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisCOSDE.length; i++) {

			if (manualCOSConteudoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
		// 2 e 3 para cadastrados
		int codigo = leia.nextInt();

		 while (true) {
                try {
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

		if (titulosManuaisCOSDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisCOSDE[indiceCadastro] = leia.nextLine();
			titulosManuaisCOSDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualCOSConteudoDE[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}



    

    public void excluirManual() { //excluir em PT

        System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisCOS.length; i++) {

			if (manualCOSConteudo[i] != null) {
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

		if (titulosManuaisCOS[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosManuaisCOS[i] = titulosManuaisCOS[i + 1];
                manualCOSConteudo[i] = manualCOSConteudo[i + 1];
            }

            titulosManuaisCOS[3] = null;
            manualCOSConteudo[3] = null;

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
		for (int i = 0; i < titulosManuaisCOSEN.length; i++) {

			if (manualCOSConteudoEN[i] != null) {
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

		if (titulosManuaisCOSEN[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosManuaisCOSEN[i] = titulosManuaisCOSEN[i + 1];
                manualCOSConteudoEN[i] = manualCOSConteudoEN[i + 1];
            }

            titulosManuaisCOSEN[3] = null;
            manualCOSConteudoEN[3] = null;

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
		for (int i = 0; i < titulosManuaisCOSDE.length; i++) {

			if (manualCOSConteudoDE[i] != null) {
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
		if (titulosManuaisCOSDE[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosManuaisCOSDE[i] = titulosManuaisCOSDE[i + 1];
                manualCOSConteudoDE[i] = manualCOSConteudoDE[i + 1];
            }

            titulosManuaisCOSDE[3] = null;
            manualCOSConteudoDE[3] = null;

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
