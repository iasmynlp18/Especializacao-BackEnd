public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // ou só incluidoNoPlano       // equals é preciso para comparar corretamente uma string
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Liberado");
        }
        else {
            System.out.println("Deve pagar a locação");
        }
    }
}
