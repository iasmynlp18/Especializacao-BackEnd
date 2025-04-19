package lista3;

import java.util.Scanner;

// 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

public class ComparacaoNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("\n-----------------------\nComparando Números\n-----------------------\n");

        System.out.println("\nDigite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("\nDigite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("\n--------------------------------\nOs dois números são iguais\n--------------------------------\n");
        }
        else {
            System.out.println("\n-------------------------------------------------\nOs dois números são diferentes\n-------------------------------------------------");
        }
        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo número\n-------------------------------------------------\n");
        }
        else if (num2 > num1) {
            System.out.println("O segundo número é maior que o primeiro número\n------------------------------------------------\n");
        }
    }
}
