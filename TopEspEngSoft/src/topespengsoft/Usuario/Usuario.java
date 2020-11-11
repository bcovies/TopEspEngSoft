/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topespengsoft.Usuario;

/**
 *
 * @author bcovies
 */
public class Usuario {

    private int id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private String endereco;
    private String nascimento;
    private String cartao;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Usuario(int id, String nome, String sobrenome, String CPF, String endereco, String nascimento, String cartao) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.cartao = cartao;
    }

}
