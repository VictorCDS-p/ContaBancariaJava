import java.util.Scanner;

public class Conta {
    enum TipoConta {
        CORRENTE, POUPANCA, SALARIO
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        TipoConta tipoDeConta;
        double saldo;

        System.out.println("""
                ==========================================
                   BEM-VINDO AO SISTEMA BANCÁRIO 25
                ==========================================
                Como deseja iniciar?
                1 - Inserir meus dados manualmente
                2 - Usar dados padrão (Teste)
                """);
        System.out.print("Escolha uma opção: ");
        int inicializacao = leitura.nextInt();
        leitura.nextLine();

        if (inicializacao == 1) {
            System.out.print("Digite seu nome completo: ");
            nome = leitura.nextLine();

            while (true) {
                System.out.println("Selecione o tipo de conta: ");
                System.out.println("1 - Corrente | 2 - Poupança | 3 - Salário");
                int escolhaTipo = leitura.nextInt();

                if (escolhaTipo == 1) {
                    tipoDeConta = TipoConta.CORRENTE;
                    break;
                } else if (escolhaTipo == 2) {
                    tipoDeConta = TipoConta.POUPANCA;
                    break;
                } else if (escolhaTipo == 3) {
                    tipoDeConta = TipoConta.SALARIO;
                    break;
                } else {
                    System.out.println("[ERRO] Opção de conta inválida!");
                }
            }

            System.out.print("Digite o saldo inicial: R$ ");
            saldo = leitura.nextDouble();
        } else {
            nome = "Cliente Exemplo da Silva";
            tipoDeConta = TipoConta.CORRENTE;
            saldo = 2500.00;
            System.out.println("\n[AVISO] Carregando perfil de teste padrão...");
        }

        String dadosIniciais = """
                
                *****************************************************************
                DADOS INICIAIS DO CLIENTE
               
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                *****************************************************************
                """.formatted(nome, tipoDeConta, saldo);

        System.out.println(dadosIniciais);

        int operacaoId = 0;

        while (operacaoId != 4) {
            System.out.println("""
                ** OPERAÇÕES **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.print("Digite a opção desejada: ");
            operacaoId = leitura.nextInt();

            switch (operacaoId) {
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println("VALOR DO SALDO ATUAL: R$ %.2f".formatted(saldo));
                    System.out.println("-------------------------------------------\n");
                    break;

                case 2:
                    System.out.print("Informe o valor a receber: R$ ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("\n>>> Sucesso! Saldo atualizado: R$ %.2f\n".formatted(saldo));
                    break;

                case 3:
                    System.out.print("Informe o valor que deseja transferir: R$ ");
                    double valorTransferencia = leitura.nextDouble();

                    if (valorTransferencia > saldo) {
                        System.out.println("\n[ERRO] Saldo insuficiente para realizar transferência.");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("\n>>> Sucesso! Transferência realizada.");
                    }
                    System.out.println(">>> Saldo atual: R$ %.2f\n".formatted(saldo));
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema. Obrigado por utilizar nossos serviços!");
                    break;

                default:
                    System.out.println("\n[AVISO] Opção inválida! Tente novamente.\n");
                    break;
            }
        }
        leitura.close();
    }
}