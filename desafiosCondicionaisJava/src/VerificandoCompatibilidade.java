// 9. Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

//Ter entre 18 e 65 anos.
// Pesar mais de 50 kg.

// Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido. Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

import java.util.Scanner;

public class VerificandoCompatibilidade {
    public static void main(String[] args) {
        int idade;
        double peso;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do doador: ");
        idade = scanner.nextInt();

        System.out.println("Informe o peso do doador: ");
        peso = scanner.nextDouble();
        scanner.close();

        if (idade >= 18 && idade <= 65 && peso > 50.0) {
            System.out.println("Doador compatível");
        }
        else {
            System.out.println("Doador incompatível\nMotivo: O doador deve ter entre 18 e 65 anos e mais que 50kg");
        }
    }
}
