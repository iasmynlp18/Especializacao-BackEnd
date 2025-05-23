// 2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

package lista4.calculadoraSala;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("A área da sala é: " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("O perímetro da sala é: " + 2 * (altura + largura));
    }

}
