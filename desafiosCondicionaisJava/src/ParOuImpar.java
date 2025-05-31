// 1. Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar. Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente?

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou ímpar: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        }
        else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
