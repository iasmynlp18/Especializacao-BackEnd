package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.setNome("Flicker");
        musica1.setArtista("ENHYPEN");
        musica1.setAlbum("Border : Day One");
        musica1.setDuracao(2.24);
        musica1.reproduzir();
        musica1.curtir();


        Podcast podcast1 = new Podcast();

        podcast1.setNome("Manha com manha");
        podcast1.setLocutor("Ana Maria Braga");
        podcast1.setTemaDoPodcast("Culinária");
        podcast1.setDuracaoEmMinutos(50.0);
        podcast1.reproduzir();
        podcast1.curtir();


        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.incluir(musica1);
        preferidas.incluir(podcast1);
    }

}
