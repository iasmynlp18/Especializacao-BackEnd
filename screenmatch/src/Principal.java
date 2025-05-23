import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("Elvis e Anabelle");
        favorito.setAnoDeLancamento(1998);
        favorito.setDuracaoEmMinutos(120);
        favorito.setIncluidoNoPlano(true);
        System.out.println("Duração em minutos: " + favorito.getDuracaoEmMinutos());

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(8);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em minutos: " + lost.getDuracaoEmMinutos());

        Filme favorito2 = new Filme();

        favorito2.setNome("The notebook");
        favorito2.setAnoDeLancamento(2000);
        favorito2.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(favorito2);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(90);
        filtro.filtra(episodio);
    }

}

