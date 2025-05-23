// 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

package lista4.conversaoTemperatura;

public interface ConversorTemperatura {
    void celsiusParaFahrenheit(double celsius);
    void fahrenheitParaCelsius(double fahrenheit);

}
