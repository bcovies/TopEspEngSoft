/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Scanner;
import topespengsoft.Usuario.Usuario;

/**
 *
 * @author bcovies
 */
public class FuncoesUsuario {

    Usuario usuario = new Usuario();
    Scanner ler = new Scanner(System.in);

    public void adicionarUsuario(Usuario usuario) {
        System.out.printf("Entre com o seu Nome: ");
        String nome = ler.nextLine();
        usuario.setNome(nome);

        System.out.printf("Entre com o seu Sobrenome: ");
        String sobrenome = ler.nextLine();
        usuario.setSobrenome(sobrenome);

        System.out.printf("Entre com o seu CPF: ");
        String CPF = ler.nextLine();
        usuario.setCPF(CPF);

        System.out.printf("Entre com o seu Endereço: ");
        String endereco = ler.nextLine();
        usuario.setEndereco(endereco);

        System.out.printf("Entre com o seu Nascimento: ");
        String nascimento = ler.nextLine();
        usuario.setNascimento(nascimento);

        System.out.printf("Entre com o seu Cartão: ");
        String cartao = ler.nextLine();
        usuario.setCartao(cartao);
    }

    public void retornaUsuario(Usuario usuario) {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Sobrenome: " + usuario.getSobrenome());
        System.out.println("CPF: " + usuario.getCPF());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Nascimento: " + usuario.getNascimento());
        System.out.println("Cartão: " + usuario.getCartao());
    }
}