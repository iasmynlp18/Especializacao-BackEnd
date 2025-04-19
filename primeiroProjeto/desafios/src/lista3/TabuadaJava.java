package lista3;

// 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class TabuadaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("\nDigite um número para saber sua tabuada: ");
        num = scanner.nextInt();

        System.out.println("\n------------\nTabuada\n------------\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
        System.out.println("\n--------------\n");
    }
}
