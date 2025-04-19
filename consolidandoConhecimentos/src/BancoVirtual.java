/* A ideia é controlarmos nossa conta bancária virtual iniciando os dados do cliente como um extrato.

 Teremos quatro opções de operações para inserir a opção desejada, se digitarmos um número inválido como "9" como opção, receberemos a mensagem "Opção inválida". Se tentarmos transferir um valor maior que o atual, teremos uma mensagem de que o saque não pode ser realizado "Não há saldo suficiente para fazer essa transferência".

 */

import java.util.Scanner;

public class BancoVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Ana Marques";
        String tipoConta = "Corrente";
        double saldoAtual = 3600;
        int opcao = 0;

        System.out.println("\n**********************************\nDados iniciais do cliente: \n\nNome:              " + nomeCliente + "\nTipo de conta:     " + tipoConta + "\nSaldo inicial:     " + saldoAtual + "\n**********************************\n");

            while (opcao != 4) {
                System.out.println("Operações: \n1 - Consultar saldos\n2 - Depositar valor\n3 - Transferir valor\n4 - Sair\n\nOpção desejada: ");
                opcao = scanner.nextInt();

                if (opcao > 4 || opcao <= 0) {
                    System.out.println("\n*************************************\nOpção inválida, digite 1,2,3 ou 4\n*************************************\n");
                }
                else {
                    switch (opcao) {
                        case 1:
                            System.out.println("\n------------------------------------\nSeu saldo atual é de: R$" + saldoAtual +"\n------------------------------------\n");
                            break;

                        case 2:
                            System.out.println("\n------------------------\nDepositar valor\n------------------------\n");

                            System.out.println("Digite o valor do depósito: ");
                            double valorRecebido = scanner.nextDouble();
                            saldoAtual = saldoAtual + valorRecebido;

                            System.out.println("\n--------------------------------------\nSeu saldo atualizado é de: R$" + saldoAtual + "\n--------------------------------------\n");
                            break;

                        case 3:
                            double valorTransferir = 0;
                            System.out.println("\n------------------------\nTransferir valor\n------------------------\n");

                            System.out.println("Digite o valor a transferir: ");
                            valorTransferir = scanner.nextDouble();

                            if (valorTransferir > saldoAtual) {
                                System.out.println("\n*****************************************************\nERRO: Digite um valor menor que o seu saldo atual\n*****************************************************\n");
                                break;
                            }
                            else {
                                saldoAtual = saldoAtual - valorTransferir;

                                System.out.println("\n--------------------------------------\nSeu saldo atualizado é de: R$" + saldoAtual + "\n--------------------------------------\n");
                                break;
                            }

                        case 4:
                            System.out.println("\n************************\nSaindo da conta...\n************************\n");
                            break;
                    }
                }
            }
    }
}
