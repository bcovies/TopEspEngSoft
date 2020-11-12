/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Services.FuncoesBicicleta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Models.Bicicleta;
import java.sql.Statement;

/**
 *
 * @author bcovies
 */
public class ConexaoBicicleta {

    private String jdbcURL = "jdbc:postgresql://localhost:11000/bicicletario";

    private String jdbcUsername = "admin";
    private String jdbcPassword = "admin";

    private static final String INSERT_BIKE_SQL = "INSERT INTO bicicleta (qrcode,km,totem,alugada) VALUES (?,?,?,?);";
    private static final String SELECT_BIKE_SQL = "SELECT alugada FROM bicicleta WHERE qrcode = ?;";
    private static final String SELECT_ALL_BIKE_SQL = "SELECT id, qrcode, km, totem, alugada FROM bicicleta WHERE qrcode = ?;";

    private static final String UPDATE_STATUS_BIKE_SQL = "UPDATE bicicleta SET alugada = ?  WHERE qrcode = ?;";

    Bicicleta bike = new Bicicleta();

    protected Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        System.out.println("\nCONEXAO:\nIniciada a conexão com o banco de dados:\t" + connection);
        return connection;
    }

    public Bicicleta insertBicicleta(Bicicleta bike) {

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BIKE_SQL)) {

            preparedStatement.setString(1, bike.getQrcode());
            preparedStatement.setString(2, bike.getKm());
            preparedStatement.setString(3, bike.getTotem());
            preparedStatement.setBoolean(4, bike.getAlugada());

            preparedStatement.executeUpdate();
//            System.out.println("\nINSERTBIKE:\n" + preparedStatement);
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return bike;
    }

    public Bicicleta searchBicicleta(String QRcode) {

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BIKE_SQL)) {

            preparedStatement.setString(1, QRcode);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                bike.setId(rs.getInt("id"));
                bike.setQrcode(rs.getString("qrcode"));
                bike.setKm(rs.getString("km"));
                bike.setTotem(rs.getString("totem"));
                bike.setAlugada(rs.getBoolean("alugada"));
            }
//            System.out.println("\nBike CONN:\n" + preparedStatement);
            rs.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            e.getMessage();
        }
        return bike;
    }

    public Boolean verificaBicicletaAlugada(String QRcode) {

        Boolean status = false;
        try (Connection connection = getConnection();
                PreparedStatement procuraBikeStatus = connection.prepareStatement(SELECT_ALL_BIKE_SQL)) {

            procuraBikeStatus.setString(1, QRcode);
            ResultSet resultadoBikeStatus = procuraBikeStatus.executeQuery();

            if (resultadoBikeStatus.next()) {
                status = resultadoBikeStatus.getBoolean("alugada");
            }
            resultadoBikeStatus.close();
            procuraBikeStatus.close();
            connection.close();
//            System.out.println("\nBike CONN:\n" + procuraBikeStatus);
        } catch (Exception e) {
            e.getMessage();
        }
        return status;
    }

    public void alugarBicicleta(String QRcode, boolean yORn) {

        if (yORn) {
            try (Connection connection = getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STATUS_BIKE_SQL)) {

                preparedStatement.setBoolean(1, true);
                preparedStatement.setString(2, QRcode);
                ResultSet rs = preparedStatement.executeQuery();
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                rs.close();
//                System.out.println("\nBike ALUGAR TRUE CONN:\n" + preparedStatement);
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            try (Connection connection = getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STATUS_BIKE_SQL)) {

                preparedStatement.setBoolean(1, false);
                preparedStatement.setString(2, QRcode);
                ResultSet rs = preparedStatement.executeQuery();
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                rs.close();
//                System.out.println("\nBike ALUGAR FALSE ONN:\n" + preparedStatement);
            } catch (Exception e) {
                e.getMessage();
            }
        }

    }
}
