// 5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

package lista2;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println(getTitulo());
        System.out.println(getAutor());
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("Título: O Mágico de OZ");
        livro1.setAutor("Autor: Não faço idéia");
        livro1.exibirDetalhes();
    }
}
