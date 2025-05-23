// Pertence a 1. Carro

package lista3.classe.carro;

public class ModeloCarro extends Carro {
    private int anoLancamento;
    private boolean automatico;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

}
