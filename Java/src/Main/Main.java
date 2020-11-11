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

        System.out.println("Bem-vindo ao nosso sistema!");

        FuncoesUsuario funcoes = new FuncoesUsuario();
        Usuario usuario = new Usuario();

        funcoes.adicionarUsuario(usuario);
        funcoes.retornaUsuario(usuario);

    }

}
