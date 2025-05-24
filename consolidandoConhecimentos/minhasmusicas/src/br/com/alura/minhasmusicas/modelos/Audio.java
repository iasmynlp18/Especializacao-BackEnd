package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String nome;
    private int totalCurtidas;
    private int totalReproducoes;
    private int classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getTotalReproducoes() {
        return totalReproducoes;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void reproduzir() {
        for (int i = 0; i < 1500; i++) {
            this.totalReproducoes++;
        }
    }

    public void curtir() {
        for (int i = 0; i < 1200; i++) {
            this.totalCurtidas++;
        }
    }
}
