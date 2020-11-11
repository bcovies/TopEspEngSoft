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
public class Bicicleta {

    private int id;
    private String hashId;
    private String kmTotal;
    private String totemId;
    private Boolean alugada;

    public Bicicleta() {
    }

    public Bicicleta(int id, String hashId, String kmTotal, String totemId, Boolean alugada) {
        this.id = id;
        this.hashId = hashId;
        this.kmTotal = kmTotal;
        this.totemId = totemId;
        this.alugada = alugada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public String getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(String kmTotal) {
        this.kmTotal = kmTotal;
    }

    public String getTotemId() {
        return totemId;
    }

    public void setTotemId(String totemId) {
        this.totemId = totemId;
    }

    public Boolean getAlugada() {
        return alugada;
    }

    public void setAlugada(Boolean alugada) {
        this.alugada = alugada;
    }
}
