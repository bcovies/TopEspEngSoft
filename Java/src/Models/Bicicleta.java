/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author bcovies
 */
public class Bicicleta {

    private int id;
    private String qrcode;
    private String km;
    private String totem;
    private Boolean alugada;

    public Bicicleta() {
    }

    public Bicicleta(int id, String qrcode, String km, String totem, Boolean alugada) {
        this.id = id;
        this.qrcode = qrcode;
        this.km = km;
        this.totem = totem;
        this.alugada = alugada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getTotem() {
        return totem;
    }

    public void setTotem(String totem) {
        this.totem = totem;
    }

    public Boolean getAlugada() {
        return alugada;
    }

    public void setAlugada(Boolean alugada) {
        this.alugada = alugada;
    }
    
    public boolean totemDigitadoCorreto(String totem) {
    	return this.totem.equalsIgnoreCase(totem);
    }

}
