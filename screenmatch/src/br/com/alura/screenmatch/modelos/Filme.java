package br.com.alura.screenmatch.modelos;

//  Uma classe especifica o conteúdo de um objeto, ou seja, as características que um filme tem nesse caso, como nome, ano de lançameto, avaliação etc.
// Não declaramos a main porque tudo que declararmos na classe br.com.alura.screenmatch.modelos.Filme será comum a todos os filmes.

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
