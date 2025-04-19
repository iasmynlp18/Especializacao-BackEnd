package lista3;

import java.util.Scanner;

// 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double medidaLados = 0.0;
        double raioCirculo = 0.0;

        System.out.println("\n----------------------------------------------\nCalculadora de Área (Quadrado e Círculo)\n----------------------------------------------\n");

        System.out.println("Escolha uma opção entre: \n1. Calcular área do quadrado\n2. Calcular área do círculo\n");
        System.out.println("Digite sua opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n-------------------------------\nCalcular área do quadrado\n-------------------------------\n");
                System.out.println("Digite a medida dos dois lados: ");
                medidaLados = scanner.nextDouble();

                double resultadoAreaQuadrado = medidaLados * medidaLados;
                System.out.println("\n-------------------------------\nA área do quadrado é: " + resultadoAreaQuadrado + "\n-------------------------------\n");
                break;

            case 2:
                System.out.println("\n-------------------------------\nCalcular área do círculo\n-------------------------------\n");
                System.out.println("Digite o raio do círculo: ");
                raioCirculo = scanner.nextDouble();

                                           //  pi  *             r^2
                double resultadoAreaCirculo = 3.14 * (raioCirculo * raioCirculo);
                System.out.println("\n-------------------------------\nA área do círculo é: " + resultadoAreaCirculo + "\n-------------------------------\n");
                break;
        }

    }
}
