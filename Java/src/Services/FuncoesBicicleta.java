/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.ConexaoBicicleta;
import java.util.Scanner;
import Models.Bicicleta;

/**
 *
 * @author bcovies
 */
public class FuncoesBicicleta {

    Bicicleta bike = new Bicicleta();
    Scanner ler = new Scanner(System.in);
    ConexaoBicicleta connBike = new ConexaoBicicleta();

    public void adicionarBicicleta(Bicicleta bike) {
        System.out.println("\nEntre com:");

        System.out.printf("QRCODE da bicicleta: ");
        String qrcode = ler.nextLine();
        bike.setQrcode(qrcode);

        System.out.printf("Totem no qual a bicicleta estará alocada: ");
        String totem = ler.nextLine();
        bike.setTotem(totem);

        String km = "0";
        bike.setKm(km);

        bike.setAlugada(false);

        connBike.insertBicicleta(bike);

    }

    public void retornaBicicleta(String Qrcode) {

        Bicicleta bike = new Bicicleta();
        bike.setQrcode(Qrcode);

        bike = connBike.searchBicicleta(Qrcode);

        System.out.println("ID: " + bike.getId());
        System.out.println("QRCODE: " + bike.getQrcode());
        System.out.println("KM's Rodados: " + bike.getKm());
        System.out.println("Totem Atual: " + bike.getTotem());
        System.out.println("Está alugada? " + bike.getAlugada());
    }

    public Boolean bicicletaAlugada(String Qrcode) {
        Boolean alugada = connBike.verificaBicicletaAlugada(Qrcode);

        if (alugada) {
            System.out.println("Bike está alugada!!");
        } else {
            System.out.println("Bike não está alugada!!");
            System.out.println("Alugando a bicicleta...");
            connBike.alugarBicicleta(Qrcode, true);
        }
        return alugada;
    }

    public Boolean devolverBikeAlugada(String Qrcode) {
       Boolean alugada = connBike.verificaBicicletaAlugada(Qrcode);

        if (alugada) {
           
            System.out.println("Confirmado, Bike está alugada!!");
            System.out.println("Estamos devolvendo ela....");
            connBike.alugarBicicleta(Qrcode, false);
        } else {
            System.out.println("Bike não está alugada!!");
        }
        return alugada;
    }

}
