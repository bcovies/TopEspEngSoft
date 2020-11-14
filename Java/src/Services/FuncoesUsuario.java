/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.ConexaoUsuario;
import java.util.Scanner;
import Models.Usuario;

/**
 *
 * @author bcovies
 */
public class FuncoesUsuario {

    Usuario usuario = new Usuario();
    ConexaoUsuario connUsuario = new ConexaoUsuario();
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

        System.out.printf("Entre com o seu Email: ");
        String email = ler.nextLine();
        usuario.setEmail(email);

        System.out.printf("Entre com o sua Senha: ");
        String senha = ler.nextLine();
        usuario.setSenha(senha);

        System.out.printf("Entre com o seu Endereço: ");
        String endereco = ler.nextLine();
        usuario.setEndereco(endereco);

        System.out.printf("Entre com o seu Nascimento: ");
        String nascimento = ler.nextLine();
        usuario.setNascimento(nascimento);

        System.out.printf("Entre com o seu Cartão: ");
        String cartao = ler.nextLine();
        usuario.setCartao(cartao);

        connUsuario.insertUser(usuario);

    }

    public Usuario retornaUsuario() {

        System.out.printf("Entre com o seu Email: ");
        String email = ler.nextLine();
        usuario.setEmail(email);

        System.out.printf("Entre com o sua Senha: ");
        String senha = ler.nextLine();
        usuario.setSenha(senha);

        usuario = connUsuario.returnUser(email, senha);
        return usuario;
    }
}
