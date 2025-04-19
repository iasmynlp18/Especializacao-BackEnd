import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        // Usando uma API/classe que vai ficar escaneando se tem entrada ou não pelo teclado
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //            ou i < 3
        for (int i = 0; i <= 2; i++) {
            System.out.println("Qual sua avaliação do filme: ");
            nota = leitura.nextDouble();

            // mediaAvaliacao = mediaAvaliacao + nota;
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/3);
    }
}
