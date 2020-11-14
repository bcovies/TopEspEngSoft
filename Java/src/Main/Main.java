/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Services.FuncoesBicicleta;
import Services.FuncoesUsuario;
import java.util.Scanner;
import Models.Bicicleta;
import Models.Usuario;

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

        Usuario usuario = new Usuario();
        Bicicleta bike = new Bicicleta();

        FuncoesUsuario funcoes = new FuncoesUsuario();
        FuncoesBicicleta funcoesBike = new FuncoesBicicleta();

        System.out.println("\n\nBem-vindo ao nosso sistema!");
        int opcao = 9;
        while (opcao != 0) {

            System.out.println("\n\nEsolha uma opção: ");
            System.out.println("[0] Sair do sistema");
            System.out.println("[1] Cadastrar usuario");
            System.out.println("[2] Logar no sistema");
            opcao = Integer.parseInt(ler.nextLine());
            switch (opcao) {
                case 0:
                    System.out.println("Obrigado por usar o Sistema!!");

                    break;
                case 1:
                    System.out.println("\n\n[1] Cadastrar Usuário");
                    funcoes.adicionarUsuario(usuario);
                    break;
                case 2:
                    System.out.println("\n[2] Logar no sistema");
                    usuario = funcoes.retornaUsuario();

                    if (usuario.getId() != 0) {

                        int opcaoUsuario = 9;

                        while (opcaoUsuario != 0) {

                            System.out.println("\n\nEsolha uma opção: ");
                            System.out.println("[0] Sair do sistema");
                            System.out.println("[5] Consultar Bicicleta");

                            opcaoUsuario = Integer.parseInt(ler.nextLine());

                            switch (opcaoUsuario) {
                                case 0:
                                    usuario.setId(0);
                                    System.out.println("Deslogado com sucesso!");
                                    break;
                                case 1:
                                    System.out.println("Cadastrar a bike!");
                                    funcoesBike.adicionarBicicleta();
                                    System.out.println("\n\n[1] Bicicleta Cadastrada:");
                                    break;

                                case 5:
                                    System.out.println("[5] Consultar Bicicleta:");
                                    System.out.println("Entre com QR code:");

                                    String consultaQRcode = ler.nextLine();

                                    bike = funcoesBike.retornaBicicleta(consultaQRcode);

                                    if (bike.getId() != 0) {
                                        int opcaoBike = 9;

                                        while (opcaoBike != 0) {

                                            System.out.println("\n\nEsolha uma opção: ");
                                            System.out.println("[0] Sair do sistema");
                                            System.out.println("[3] Alugar Bicicleta");
                                            System.out.println("[4] Devolver Bicicleta");

                                            opcaoBike = Integer.parseInt(ler.nextLine());
                                            switch (opcaoBike) {
                                                case 0: {
                                                    System.out.println("Saindo da bicicleta!!");
                                                    bike.setId(0);
                                                    break;
                                                }
                                                case 3: {
                                                    funcoesBike.bicicletaAlugada(bike.getId());
                                                    break;
                                                }
                                                case 4: {
                                                    funcoesBike.devolverBikeAlugada(bike.getId());
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Bike não encontrada!");
                                    }
                            }
                        }
                    }
            }
        }

    }

}
