// 3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

package lista3.classe.conta.bancaria;

public class ContaBancaria {
    protected double saldo = 5000;
    private double valorDeposito;
    private double valorSaque;

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public void depositar() {
        saldo += getValorDeposito();
        System.out.println("Depósito realizado com sucesso");
    }

    public void sacar() {
        saldo -= getValorSaque();
        System.out.println("Saque realizado com sucesso");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void saldoInicial() {
        System.out.println("Saldo inicial: " + saldo);
    }
}
