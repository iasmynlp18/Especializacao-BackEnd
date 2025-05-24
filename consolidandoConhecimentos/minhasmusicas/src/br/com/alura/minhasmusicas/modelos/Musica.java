package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String artista;
    private String album;
    private double duracao;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 1000) {
            return 10;
        }
        else {
            return 5;
        }
    }
}
