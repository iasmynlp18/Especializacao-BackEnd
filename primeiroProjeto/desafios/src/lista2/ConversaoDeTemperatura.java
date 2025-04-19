package lista2;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        // Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit. formula: (temperatura * 1.8) + 32. Depois, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.

        double celsius = 18.3;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura Fahrenheit é: %.2f", fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteiro = (int) fahrenheit;

        String mensagem2 = ("A temperatura Fahrenheit inteira é: %d".formatted(fahrenheitInteiro));
        System.out.println(mensagem2);


    }
}
