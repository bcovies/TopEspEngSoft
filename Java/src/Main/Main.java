/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Services.FuncoesUsuario;
import java.util.Scanner;
import topespengsoft.Usuario.Usuario;

/**
 *
 * @author bcovies
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        FuncoesUsuario funcoes = new FuncoesUsuario();
        Usuario usuario = new Usuario();
        System.out.println("Bem-vindo ao nosso sistema!");
        int opcao = 9;
        while (opcao != 0) {

            System.out.println("\n\nEsolha uma opção: ");
            System.out.println("[0] Sair do sistema");
            System.out.println("[1] Cadastrar usuario");
            System.out.println("[2] Logar no sistema");
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.println("\n\n[1] Cadastrar Usuário");
                funcoes.adicionarUsuario(usuario);
                System.out.println("\n\n[1] Usuario Cadastrado:");
                funcoes.retornaUsuario(usuario);
            }
            if (opcao == 2) {
                System.out.println("[2] Logar no sistema");
                funcoes.logarUsuario(usuario);
            }
        }

    }

}
