// Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

package lista2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // pede o numeroConta por parametro e atribui o valor pego ao atributo numeroConta DESSA classe usando this.
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // pede o saldo por parametro e atribui o valor pego ao atributo saldo DESSA classe usando this.
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
