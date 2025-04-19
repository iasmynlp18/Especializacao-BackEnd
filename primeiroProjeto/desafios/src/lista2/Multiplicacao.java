package lista2;

public class Multiplicacao {
    public static void main(String[] args) {
        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 35.34;
        int quantidade = 3;

        double valorTotal = precoProduto * quantidade;

        String mensagem = String.format("O valor total foi de: %.3f", valorTotal);

        System.out.println(mensagem);

    }
}
