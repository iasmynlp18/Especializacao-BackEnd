// 5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

package lista1;

public class Aluno {
    String nome;
    int idade;

    void valores(String nomeAluno, int idadeAluno) {
        nome = nomeAluno;
        idade = idadeAluno;
    }

    void exibeInformacoes() {
        System.out.println("Nome: " +  nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.valores("Lara", 19);
        aluno1.exibeInformacoes();
    }

}
