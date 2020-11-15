/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bcovies
 */
public class Usuario {

    private int id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private String email;
    private String senha;
    private String endereco;
    private String nascimento;
    private String cartao;
    private static final String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
    public Usuario() {
    }

    public Usuario(int id, String nome, String sobrenome, String CPF, String email, String senha, String endereco, String nascimento, String cartao) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.cartao = cartao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
    
    public boolean isCpfValido() {
    	if (CPF.length() != 11)
    		return false;
    	
        char dig10, dig11;
        int sm, i, r, num, peso;
        
        try {
	        sm = 0;
	        peso = 10;
	        for (i=0; i<9; i++) {
		        num = (int)(CPF.charAt(i) - 48);
		        sm = sm + (num * peso);
		        peso = peso - 1;
	        }
	
	        r = 11 - (sm % 11);
	        if ((r == 10) || (r == 11))
	            dig10 = '0';
	        else dig10 = (char)(r + 48);
	
	        sm = 0;
	        peso = 11;
	
	        for(i=0; i<10; i++) {
		        num = (int)(CPF.charAt(i) - 48);
		        sm = sm + (num * peso);
		        peso = peso - 1;
	        }
	
	        r = 11 - (sm % 11);
	        if ((r == 10) || (r == 11))
	             dig11 = '0';
	        else dig11 = (char)(r + 48);
	
	        if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	             return true;
	        else return false;
        }
        catch (InputMismatchException erro) {
	            return false;
        }
    }
    
    public boolean isEmailValido() {
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
