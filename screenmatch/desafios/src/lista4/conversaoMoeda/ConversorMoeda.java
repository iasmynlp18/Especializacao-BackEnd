// 1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

package lista4.conversaoMoeda;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        System.out.println("O valor " + valorDolar + " convertido para reais é: " + valorDolar * 5.72);
    }
}
