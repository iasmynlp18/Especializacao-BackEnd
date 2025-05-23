// 1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

package lista3.classe.carro;

public class Principal {
    public static void main(String[] args) {

        ModeloCarro celta = new ModeloCarro();

        celta.setNomeDoModelo("Celta Preto");
        celta.setPrecoMedioPrimeiroAno(10000);
        celta.setPrecoMedioSegundoAno(12000);
        celta.setPrecoMedioTerceiroAno(14000);
        celta.imprimirInformacoes();
        celta.MaoirMenorPreco(celta.getPrecoMedioPrimeiroAno(), celta.getPrecoMedioSegundoAno(), celta.getPrecoMedioTerceiroAno());
        celta.setAnoLancamento(1960);
        System.out.println("Automatico: " + celta.isAutomatico());


    }
}
