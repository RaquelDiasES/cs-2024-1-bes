package atividade08;

import java.util.Scanner;

public class FazerLogin {
    public static void main(String[] args) {
        Login login = new Login("usuario", "senha");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        try {
            boolean loginSucesso = login.fazer_login(usuarioDigitado, senhaDigitada);
            System.out.println("Login bem sucedido: " + loginSucesso);
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}

