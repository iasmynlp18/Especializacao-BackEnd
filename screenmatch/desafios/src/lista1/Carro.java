// 4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

package lista1;

public class Carro {
    String modelo = "Celta";
    int ano = 2005;
    String cor = "Preto";

    void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void idadeCarro(int anoAtual) {
        System.out.println("Idade do carro: " + (anoAtual - ano));
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.fichaTecnica();
        carro1.idadeCarro(2025);
    }
}
