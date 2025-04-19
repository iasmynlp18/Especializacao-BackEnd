package lista3;

import java.util.Random;
import java.util.Scanner;

/* Faça como eu fiz:

Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

*/

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int palpite = 0;
        int tentativas = 0;

        System.out.println("\n--------------------------------------\nBem vindo ao Jogo de adivinhação\n--------------------------------------");
        System.out.println("Tente adivinhar o número sorteado entre 0 e 100.");

        while (tentativas < 5) {
            System.out.println("\nDigite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("\n---------------------------------------------\nParabéns, você acertou o número sorteado\n---------------------------------------------\n");
            }
            else if (palpite < numeroAleatorio) {
                System.out.println("\nO número sorteado é maior");
                tentativas++;
            }
            else {
                System.out.println("\nO número sorteado é menor");
                tentativas++;
            }
            if (tentativas == 5) {
                System.out.println("\n-----------------------------\nGame Over >:C \n-----------------------------\n");
            }
        }

    }
}
