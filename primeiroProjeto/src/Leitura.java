import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        // Usando uma API/classe que vai ficar escaneando se tem entrada ou não pelo teclado
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");

        // nextLine() - Pede que uma entrada STRING para a próxima linha e guarda na variável criada (filme)
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento: ");

        // nextInt() - Pede uma entrada INT para a próxima linha e guarda em anoDeLancamento
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua avaliação do filme: ");

        // nextDouble() - Pede uma entrada DOUBLE para a próxima linha e guarda em avaliacao
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
