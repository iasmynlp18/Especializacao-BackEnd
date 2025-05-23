package lista3.classe.conta.bancaria;

public class Principal {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();

        conta1.saldoInicial();
        conta1.setValorSaque(100);
        conta1.sacar();
        conta1.setValorDeposito(200);
        conta1.depositar();
        conta1.consultarSaldo();
        conta1.cobrarTarifaMensal();
    }
}
