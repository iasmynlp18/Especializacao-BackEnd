// 1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

package lista1;

public class Pessoa {
    void cumprimento() {
        System.out.println("Olá, mundo!");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cumprimento();
    }

}
