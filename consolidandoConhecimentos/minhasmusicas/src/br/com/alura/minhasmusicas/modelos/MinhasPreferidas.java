package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getNome() + " está entre as/os melhores");
        }
        else {
            System.out.println("Vale a pena conhecer " + audio.getNome());
        }
    }
}
