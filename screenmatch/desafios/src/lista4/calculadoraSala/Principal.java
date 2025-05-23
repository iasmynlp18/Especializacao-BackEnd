// 2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

package lista4.calculadoraSala;

public class Principal extends CalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calcularSala = new CalculadoraSalaRetangular();

        calcularSala.calcularArea(5.40, 500.00);
        calcularSala.calcularPerimetro(6.50, 200.00);
    }
}
