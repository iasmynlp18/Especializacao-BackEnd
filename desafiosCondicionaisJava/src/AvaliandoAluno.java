// 2. Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é: O estudante é aprovado se média final é maior ou igual a 7.0. Se a média for entre 5.0 e 6.9, está de recuperação. Se for abaixo de 5.0, está reprovado. Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.

import java.util.Scanner;

public class AvaliandoAluno {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextDouble();
        scanner.close();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("O estudante teve a média " + media + " e foi aprovado!");
        }
        else if (media >= 5.0 && media <= 6.9) {
            System.out.println("O estudante teve a média " + media + " e está de recuperação!!");
        }
        else {
            System.out.println("O estudante teve a média " + media + " e foi reprovado!!!");
        }
    }
}
