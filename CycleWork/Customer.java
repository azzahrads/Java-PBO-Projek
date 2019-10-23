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
public class Customer {
    private String kode_customer;
    private String nama_customer;
    private String nomor_telepon;
    
    public void Customer(){}

////////////////////////////SETTER & GETTER///////////////////
    public String getKode_customer() {
        return kode_customer;
    }

    public void setKode_customer(String kode_customer) {
        this.kode_customer = kode_customer;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }
//////////////////////////////////////////////////////////////
// METHOD    
    public void Customer(String kode, String nama,String nomor_telepon)
    {
        this.kode_customer = kode;
        this.nama_customer = nama;
        this.nomor_telepon = nomor_telepon;                
    }
    
    public void getInfo()
    {
        System.out.println("Kode \t\t : "+getKode_customer());
        System.out.println("Customer atas nama\t : " + getNama_customer()   );
        System.out.println("Kontak Person \t : "+ getNomor_telepon());
    }
}
