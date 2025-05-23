// 5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

package lista4.produto;

public interface Calculavel {

    double calcularPrecoFinal(double valorOriginal, double desconto);
}
