/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.CycleWork;

/**
 *
 * @author user
 */
public class Sepeda {
    public String kode_Sepeda;
    public String nama;
    public String merk;
    public int harga;
    
    
    public Sepeda(){}
    ////////////////////////////SETTER & GETTER///////////////////

    public String getKode_Sepeda() {
        return kode_Sepeda;
    }

    public void setKode_Sepeda(String kode_Sepeda) {
        this.kode_Sepeda = kode_Sepeda;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    ///////////////////////////////////////////////
    
    public void getInfo()
    {
        System.out.println("Kode Sepeda \t : "+getKode_Sepeda());
        System.out.println("Nama Sepeda \t : "+ getNama());
        System.out.println("Merk\t\t : "+getMerk());
        System.out.println("Harga\t\t : "+getHarga());
    }
    
}
