// 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

package lista4.conversaoTemperatura;

public class ConversaoTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        System.out.println(celsius + " convertido para Fahrenheit é: " + (celsius * 1.8) + 32);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        System.out.println(fahrenheit + " convertido para Celsius é: " + (fahrenheit - 32) * 1/1.8);
    }
}
