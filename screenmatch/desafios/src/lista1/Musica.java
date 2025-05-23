// 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

package lista1;

public class Musica {
    String titulo = "Loose";
    String artista = "ENHYPEN";
    int anoLancamento = 2025;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica () {
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {
        avaliacao = avaliacao + nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica musicaBoa = new Musica();
        musicaBoa.fichaTecnica();
        musicaBoa.avaliar(10);
        musicaBoa.avaliar(100);
        musicaBoa.avaliar(1000);
        System.out.println("Media de avaliações: " + musicaBoa.mediaAvaliacoes());
    }
}
