// 1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

package lista3.classe.carro;

public class Carro {
    private String nomeDoModelo;
    private double precoMedioPrimeiroAno;
    private double precoMedioSegundoAno;
    private double precoMedioTerceiroAno;

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public double getPrecoMedioPrimeiroAno() {
        return precoMedioPrimeiroAno;
    }

    public void setPrecoMedioPrimeiroAno(double precoMedioPrimeiroAno) {
        this.precoMedioPrimeiroAno = precoMedioPrimeiroAno;
    }

    public double getPrecoMedioSegundoAno() {
        return precoMedioSegundoAno;
    }

    public void setPrecoMedioSegundoAno(double precoMedioSegundoAno) {
        this.precoMedioSegundoAno = precoMedioSegundoAno;
    }

    public double getPrecoMedioTerceiroAno() {
        return precoMedioTerceiroAno;
    }

    public void setPrecoMedioTerceiroAno(double precoMedioTerceiroAno) {
        this.precoMedioTerceiroAno = precoMedioTerceiroAno;
    }

    public void MaoirMenorPreco(double primeiroAno, double segundoAno, double terceiroAno) {
        double maiorPreco = primeiroAno;
        double menorPreco = primeiroAno;

        if (segundoAno > maiorPreco) {
            maiorPreco = segundoAno;
        }

        if (terceiroAno > maiorPreco) {
            maiorPreco = terceiroAno;
        }

        if (segundoAno < menorPreco) {
            menorPreco = segundoAno;
        }

        if (terceiroAno < menorPreco) {
            menorPreco = terceiroAno;
        }

        System.out.println("\nMaior preço: " + maiorPreco);
        System.out.println("Menor preço: " + menorPreco);
    }

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + nomeDoModelo);
        System.out.println("Preço primeiro ano: " + precoMedioPrimeiroAno);
        System.out.println("Preço segundo ano: " + precoMedioSegundoAno);
        System.out.println("Preço terceiro ano: " + precoMedioTerceiroAno);
    }

}
