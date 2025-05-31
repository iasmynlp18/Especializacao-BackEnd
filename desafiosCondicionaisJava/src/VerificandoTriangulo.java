// 8. Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não. Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

import java.util.Scanner;

public class VerificandoTriangulo {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        lado3 = scanner.nextDouble();
        scanner.close();

        if (lado1 + lado2 > lado3 && lado3 + lado1 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        }
        else {
            System.out.println("Os lados NÃO podem formar um triângulo.");
        }

    }
}
