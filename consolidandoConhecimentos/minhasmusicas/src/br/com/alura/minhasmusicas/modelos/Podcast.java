package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String locutor;
    private String temaDoPodcast;
    private double duracaoEmMinutos;

    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }

    public String getTemaDoPodcast() {
        return temaDoPodcast;
    }

    public void setTemaDoPodcast(String temaDoPodcast) {
        this.temaDoPodcast = temaDoPodcast;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 8;
        }
        else {
            return 4;
        }
    }
}
