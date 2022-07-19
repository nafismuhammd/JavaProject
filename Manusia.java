/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmanusia;

/**
 *
 * @author MNafis
 */
public class Manusia {
    private String nama, nik, jk = null;
    private boolean jenisKelamin, menikah;
    
    public double getTunjangan(boolean b,boolean a){
        if (a==true && b==true) {
            return 25;
        }else if (a== true && b == false) {
            return 20;
        }else return 15;
    }
    
    public double getPendapatan(){
        return this.getTunjangan(jenisKelamin, menikah);
    }
    
    
    public String toString(){
        return "nama\t\t: "+nama+"\nnik\t\t: "+nik+"\nJenis Kelamin\t: "+jk+"\nPendapatan\t: "+this.getPendapatan();
    }
    
    public Manusia(String nama,String nik,boolean jk,boolean m){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin=jk;
        this.menikah=m;
        if (jk == true) {
            this.jk = "Laki - Laki";
        }else this.jk = "Perempuan";
    }
}
