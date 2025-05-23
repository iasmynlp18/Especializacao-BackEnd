// 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

package lista4.conversaoTemperatura;

public class Principal extends ConversaoTemperaturaPadrao {
    public static void main(String[] args) {
        ConversaoTemperaturaPadrao conversor = new ConversaoTemperaturaPadrao();

        conversor.celsiusParaFahrenheit(23.5);
        conversor.fahrenheitParaCelsius(52.5);
    }
}
