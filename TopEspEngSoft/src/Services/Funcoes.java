/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import topespengsoft.Usuario.Usuario;

/**
 *
 * @author bcovies
 */
public class Funcoes {
    
    Usuario usuario = new Usuario();
    
    public void adicionarUsuario(String nome, String sobrenome, String CPF, String endereco, String nascimento, String cartao){
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);
        usuario.setCPF(CPF);
        usuario.setEndereco(endereco);
        usuario.setNascimento(nascimento);
        usuario.setCartao(cartao);
    }
    public void retornaUsuario(Usuario usuario){
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    
}
