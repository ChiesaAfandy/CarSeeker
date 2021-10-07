package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aan Furqan
 */
public class Mobil {
    private int id_mobil, id_akun;
    private String tanggal_post, tipe_mobil, merk, model, varian;
    private String tahun;
    private String warna, kapasitas_mesin, transmisi,kapasitas_penumpang;
    private int  kilometer;
    private String deskripsi_mobil, judul_iklan;
    private int harga;
    private byte [] gambar;

    public Mobil(int id_mobil, int id_akun, String tanggal_post, String tipe_mobil, String merk, String model, String varian, String tahun, String warna, String kapasitas_mesin, String transmisi, String kapasitas_penumpang, int kilometer, String deskripsi_mobil, String judul_iklan, int harga, byte[]gambar) {
        this.id_mobil = id_mobil;
        this.id_akun = id_akun;
        this.tanggal_post = tanggal_post;
        this.tipe_mobil = tipe_mobil;
        this.merk = merk;
        this.model = model;
        this.varian = varian;
        this.tahun = tahun;
        this.warna = warna;
        this.kapasitas_mesin = kapasitas_mesin;
        this.transmisi = transmisi;
        this.kapasitas_penumpang = kapasitas_penumpang;
        this.kilometer = kilometer;
        this.deskripsi_mobil = deskripsi_mobil;
        this.judul_iklan = judul_iklan;
        this.harga = harga;
        this.gambar = gambar;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }
    
    

    public int getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(int id_mobil) {
        this.id_mobil = id_mobil;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public String getTanggal_post() {
        return tanggal_post;
    }

    public void setTanggal_post(String tanggal_post) {
        this.tanggal_post = tanggal_post;
    }

    public String getTipe_mobil() {
        return tipe_mobil;
    }

    public void setTipe_mobil(String tipe_mobil) {
        this.tipe_mobil = tipe_mobil;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVarian() {
        return varian;
    }

    public void setVarian(String varian) {
        this.varian = varian;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getKapasitas_mesin() {
        return kapasitas_mesin;
    }

    public void setKapasitas_mesin(String kapasitas_mesin) {
        this.kapasitas_mesin = kapasitas_mesin;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getKapasitas_penumpang() {
        return kapasitas_penumpang;
    }

    public void setKapasitas_penumpang(String kapasitas_penumpang) {
        this.kapasitas_penumpang = kapasitas_penumpang;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getDeskripsi_mobil() {
        return deskripsi_mobil;
    }

    public void setDeskripsi_mobil(String deskripsi_mobil) {
        this.deskripsi_mobil = deskripsi_mobil;
    }

    public String getJudul_iklan() {
        return judul_iklan;
    }

    public void setJudul_iklan(String judul_iklan) {
        this.judul_iklan = judul_iklan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    
    
}
