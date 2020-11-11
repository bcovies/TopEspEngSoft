/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import topespengsoft.Usuario.Usuario;

/**
 *
 * @author bcovies
 */
public class ConexaoUsuario {

    private String jdbcURL = "jdbc:postgresql://localhost:11000/bicicletario";

    private String jdbcUsername = "admin";
    private String jdbcPassword = "admin";

    private static final String INSERT_USER_SQL = "INSERT INTO usuario (nome,sobrenome,cpf,email,senha,endereco,nascimento,cartao) VALUES (?,?,?,?,?,?,?,?);";

    protected Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\nUSUARIODAO:\nIniciada a conexão com o banco de dados:\t" + connection);
        return connection;
    }

    public void insertUser(Usuario usuario) {

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getSobrenome());
            preparedStatement.setString(3, usuario.getCPF());
            preparedStatement.setString(4, usuario.getEmail());
            preparedStatement.setString(5, usuario.getSenha());
            preparedStatement.setString(6, usuario.getEndereco());
            preparedStatement.setString(7, usuario.getNascimento());
            preparedStatement.setString(8, usuario.getCartao());
            preparedStatement.executeUpdate();
            System.out.println("\nUSUARIODAO:\n" + preparedStatement);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
