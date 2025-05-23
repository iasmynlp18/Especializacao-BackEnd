// 3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

package lista2;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int percentual) {
        double novoPreco = preco - (preco * percentual / 100);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setPreco(30.00);
        System.out.println("Preço inicial do produto: " + produto1.preco);

        produto1.aplicarDesconto(10);
    }
}
