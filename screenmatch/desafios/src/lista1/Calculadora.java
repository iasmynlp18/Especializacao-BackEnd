// 2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

package lista1;

public class Calculadora {
    int retornaOdobro(int numero) {
        return numero * 2;
    }
    
    public static void main(String[] args) {
        Calculadora numero = new Calculadora();
        System.out.println(numero.retornaOdobro(6));
    }
}
