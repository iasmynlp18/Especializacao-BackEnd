// 2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

package lista2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // pega o nome por parâmetro e o atribui para o atributo nome DESSA classe
    public void setNome(String nome) {
        this.nome = nome;
    }

    // pega a idade por parâmetro e a atribui para o atributo idade DESSA classe
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (getIdade() >= 18) {
            System.out.println(getNome() + " é maior de idade");
        } else {
            System.out.println(getNome() + " é menor de idade");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Mari");
        pessoa1.setIdade(19);
        pessoa1.verificarIdade();
    }
}
