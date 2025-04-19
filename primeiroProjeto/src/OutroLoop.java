import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        // Usando uma API/classe que vai ficar escaneando se tem entrada ou não pelo teclado
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme (ou -1 para encerrar): ");
            nota = leitura.nextDouble();

            // para não somar a nota com o -1
            if (nota != -1) {
                // mediaAvaliacao = mediaAvaliacao + nota;
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/totalNotas);
    }
}

