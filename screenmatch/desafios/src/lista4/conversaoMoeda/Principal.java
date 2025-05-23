// 1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

package lista4.conversaoMoeda;

public class Principal extends ConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        conversor.converterDolarParaReal(5.00);
    }
}
