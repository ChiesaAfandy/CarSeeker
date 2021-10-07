/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;


/**
 *
 * @author Chiesaafandy
 */
public class Menu {

    private int id;
    private String judul;
    private String merek;
    private String model;
    private int harga;
    private byte [] gambar;

    public Menu(int id, String judul, String merek, String model, int harga, byte[] gambar) {
        this.id = id;
        this.judul = judul;
        this.merek = merek;
        this.model = model;
        this.harga = harga;
        this.gambar = gambar;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }
    
    
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
    
    
}
