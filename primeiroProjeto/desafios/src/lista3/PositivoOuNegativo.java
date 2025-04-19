package lista3;

// 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        System.out.println("\n-----------------------------------------\nEsse número é Posistivo ou Negativo?\n-----------------------------------------");

        System.out.println("\nDigite um número: ");
        input = scanner.nextInt();

        if (input > 0) {
            System.out.println("\n---------------------------\nO número " + input + " é positivo\n---------------------------\n");
        }
        else {
            System.out.println("\n---------------------------\nO número " + input + " é negativo\n---------------------------\n");
        }
    }
}
