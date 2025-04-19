package lista3;

import java.util.Scanner;

// 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("\n------------------\nPar ou Ímpar?\n------------------\n");
        System.out.println("Digite um número para saber se é par ou ímpar: ");
        num = scanner.nextInt();

        // se o resto da divisão entre num e 2 for == 0
        if (num % 2 == 0) {
            System.out.println("\n---------------------\nO número " + num + " é par\n---------------------\n");
        }
        else if (num % 2 == 1) {
            System.out.println("\n---------------------\nO número " + num + " é ímpar\n---------------------\n");
        }
    }
}
