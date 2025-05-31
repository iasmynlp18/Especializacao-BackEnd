// 6. Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não. Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.

import java.util.Scanner;

public class VerificandoDiaUtil {
    public static void main(String[] args) {
        String diaSemana;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite: \n - segunda\n - terça\n - quarta\n - quinta\n - sexta\n - sábado\n - domingo\nPara saber se é dia útil ou não: ");
        diaSemana = scanner.next();
        scanner.close();

        if (diaSemana.equals("segunda") || diaSemana.equals("terça") || diaSemana.equals("quarta") || diaSemana.equals("quinta") || diaSemana.equals("sexta")) {
            System.out.println("\n" + diaSemana + " é um dia útil");
        }
        else {
            System.out.println("\n" + diaSemana + " não é um dia útil");
        }
    }
}
