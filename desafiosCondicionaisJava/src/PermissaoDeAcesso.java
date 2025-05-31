// 10. João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

// Um código de acesso numérico (o código correto é 2023).
// Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
// O sistema só permitirá o acesso se: O código de acesso estiver correto.
// O nível de permissão for válido (1, 2 ou 3).

//Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

//Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.

import java.util.Scanner;

public class PermissaoDeAcesso {
    public static void main(String[] args) {
        int codigoAcessoDefinido = 2023;
        int codigoAcessoUser;
        int nivelPermissao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de acesso: ");
        codigoAcessoUser = scanner.nextInt();

        System.out.println("Digite o nível de permissão: ");
        nivelPermissao = scanner.nextInt();
        scanner.close();

        if (codigoAcessoDefinido == codigoAcessoUser && nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        }
        else {
            System.out.println("Acesso negado");
        }
    }
}
