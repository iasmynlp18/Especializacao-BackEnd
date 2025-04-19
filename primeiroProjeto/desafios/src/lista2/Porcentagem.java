package lista2;

public class Porcentagem {
    public static void main(String[] args) {
        // 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 70.99;
        double percentualDesconto = 5;

        double desconto = precoOriginal * percentualDesconto/100;
        double valorComDesconto = precoOriginal - desconto;

        System.out.println(valorComDesconto);

    }
}
