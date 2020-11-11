/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Services.FuncoesBicicleta;
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
        FuncoesBicicleta funcoesBike = new FuncoesBicicleta();
        Usuario usuario = new Usuario();
        System.out.println("\n\nBem-vindo ao nosso sistema!");
        int opcao = 9;
        while (opcao != 0) {

            System.out.println("\n\nEsolha uma opção: ");
            System.out.println("[0] Sair do sistema");
            System.out.println("[1] Cadastrar usuario");
            System.out.println("[2] Logar no sistema");
            opcao =  Integer.parseInt(ler.nextLine());
            if (opcao == 0) {
                System.out.println("OUT");
            } else if (opcao == 1) {

                System.out.println("\n\n[1] Cadastrar Usuário");
                funcoes.adicionarUsuario(usuario);
                System.out.println("\n\n[1] Usuario Cadastrado:");
                funcoes.retornaUsuario(usuario);
            } else if (opcao == 2) {

                System.out.println("\n[2] Logar no sistema");
                boolean auntenticouLogin = funcoes.logarUsuario(usuario);

                if (auntenticouLogin) {

                    int opcaoUsuario = 9;

                    while (opcaoUsuario != 0) {
                        System.out.println("\n\nEsolha uma opção: ");
                        System.out.println("[0] Sair do sistema");
                        System.out.println("[3] Alugar Bicicleta");
                        System.out.println("[4] Devolver Bicicleta");
                        opcaoUsuario =  Integer.parseInt(ler.nextLine());
                        if (opcaoUsuario == 0) {
                            System.out.println("OUT");
                        } else if (opcaoUsuario == 3) {

                            System.out.println("Entre com o HASH ID presente na bicicleta: ");
                            String novoQrCode = ler.nextLine();
                            
                            boolean EstaAlugada = funcoesBike.bicicletaAlugada(novoQrCode);
                            funcoesBike.alugarBicicleta(EstaAlugada);
                            System.out.println("Alugel feito com sucesso, será debitado assim que devolver a bicicleta");
                        } else if (opcaoUsuario == 4) {
                            System.out.println("Obrigado por devolver a bike!");
                        } else {
                            System.out.println("\nOPÇÃO INVÁLIDA!!");
                        }
                    }

                }
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA!!");
            }
        }

    }

}
