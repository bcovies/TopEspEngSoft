/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author bcovies
 */
public class ConexaoBicicleta {

    private String jdbcURL = "jdbc:postgresql://localhost:11000/bicicletario";

    private String jdbcUsername = "admin";
    private String jdbcPassword = "admin";

    private static final String INSERT_BIKE_SQL = "INSERT into bicicleta (qrcode,km,totem,alugada) VALUES ('101','0','anil',false);;";
    private static final String SELECT_BIKE_SQL = "SELECT id FROM bicicleta WHERE qrcode = ?;";

    protected Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\nCONEXAO:\nIniciada a conexão com o banco de dados:\t" + connection);
        return connection;
    }

    public Boolean bicicletaAlugada(String qrcodeBike) {
        boolean alugado = false;

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BIKE_SQL)) {

            preparedStatement.setString(1, qrcodeBike);
            ResultSet rs;
            rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String hashIdBike = rs.getString("qrcodeBike");
                alugado = true;
            }
            preparedStatement.executeUpdate();
            
            System.out.println("\nBike CONN:\n" + preparedStatement);
        } catch (Exception e) {
            e.getMessage();
        }
        return alugado;
    }

}
