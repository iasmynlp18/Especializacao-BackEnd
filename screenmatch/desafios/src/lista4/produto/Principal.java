// 5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

package lista4.produto;

public class Principal extends ProdutoFisico {

    public static void main(String[] args) {
        Livro livro = new Livro();

        System.out.println(livro.calcularPrecoFinal(300.00, 5));
    }
}
