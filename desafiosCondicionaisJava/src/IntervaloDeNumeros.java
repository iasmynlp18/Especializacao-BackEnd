// 7. Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais. Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        double valor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        valor = scanner.nextDouble();
        scanner.close();

        if (valor <= 5000 && valor >= 1000) {
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        }
        else {
            System.out.println("O valor " + valor + " NÃO está dentro do intervalo permitido para empréstimo.");
        }
    }
}
