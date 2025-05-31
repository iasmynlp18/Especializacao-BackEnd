// 4. Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente. Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros, compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.

import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1 + ".");
        }
        else if (num2 == num1) {
            System.out.println(num2 + " é igual a " + num1);
        }
        else {
            System.out.println("O maior número é " + num2 + ".");
        }
    }
}
