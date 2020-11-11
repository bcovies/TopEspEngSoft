/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Scanner;
import topespengsoft.Usuario.Bicicleta;

/**
 *
 * @author bcovies
 */
public class FuncoesBicicleta {

    Bicicleta bike = new Bicicleta();
    Scanner ler = new Scanner(System.in);

    public void adicionarBicicleta() {
        System.out.println("Alugar bike:");
        System.out.println("\nEntre com:");

        System.out.printf("HashID da bicicleta: ");
        String hashId = ler.nextLine();
        bike.setHashId(hashId);
        System.out.printf("Totem no qual a bicicleta estará alocada: ");

        String totemId = ler.nextLine();
        bike.setTotemId(totemId);

        String kmTotal = "0";
        bike.setKmTotal(kmTotal);

        Boolean aludaga = false;
        bike.setAlugada(aludaga);

    }

    public Boolean bicicletaAlugada(Bicicleta bike) {
        Boolean alugada;

        if (bike.getAlugada()) {
            alugada = true;

        } else {
            alugada = false;
        }

        return alugada;
    }

    public void alugarBicicleta(Boolean estaAlugada) {

        if (estaAlugada) {

        } else {
            System.out.println("Bike já está alugada, tente outra...");
        }
    }
}
