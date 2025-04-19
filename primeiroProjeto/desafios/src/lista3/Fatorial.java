package lista3;

import java.util.Scanner;

// 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("\n----------------------\nCálculo de Fatorial\n----------------------\n");
        System.out.println("Digite um número inteiro para saber seu fatorial: ");
        num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("O fatorial de " + num + "é 1");
        }
        else {
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {

                // fatorial pega seu próprio valor e multiplica pelo próximo já que i está somando +1 até chegar em num
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
    }
}
