// Pertence a 3. ContaBancaria

package lista3.classe.conta.bancaria;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        double tarifaMensal = 5.00;
        saldo -= tarifaMensal;
        System.out.println("Saldo com cobrança de tarifa: " + saldo + "\n\n");
    }
}
