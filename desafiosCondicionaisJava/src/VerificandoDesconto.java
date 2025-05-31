// 5. Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não, juntamente com o novo valor após o desconto, caso aplicável. Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi aplicado ou não.

import java.util.Scanner;

public class VerificandoDesconto {
    public static void main(String[] args) {
        double valorCompra;
        double valorComDesconto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();
        scanner.close();

        if (valorCompra >= 100.00) {
            System.out.println("--------------------------------\nDesconto aplicado com sucesso!\n--------------------------------\nValor original da compra: R$" + valorCompra);

            valorComDesconto = valorCompra * 0.10;
            valorComDesconto = valorCompra - valorComDesconto;

            System.out.println("Valor com 10% de desconto: R$" + valorComDesconto);
        }
        else {
            System.out.println("-------------------------\nDesconto não aplicável.\n-------------------------");
            System.out.println("Valor total: R$" + valorCompra);
        }
    }
}
