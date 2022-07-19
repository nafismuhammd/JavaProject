/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmanusia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    
    public Pekerja(double gaji,int tahun,int bulan,int tanggal,int jmlank,String nama,String nik,boolean jk,boolean m){
        super(nama,nik,jk,m);
        this.gaji = gaji;
        this.jumlahAnak=jmlank;
        this.tahunMasuk=LocalDate.of(tahun, bulan, tanggal);
    }

    public double getGaji() {
        return gaji;
    }
    
    
    
    public String tanggal(){
        String a[] = tahunMasuk.toString().split("-");
        return a[2]+" "+a[1]+" "+a[0];
    }
    
    public double getBonus(){
        double tk = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (tk<=5) {
            return gaji*5/100+gaji;
        }else if (tk>5 && tk<=10) {
            return gaji*10/100+gaji;
        }else return gaji*15/100+gaji;
    }
    
    @Override
    public double getPendapatan(){
        return super.getPendapatan()+this.getBonus()+(double)this.jumlahAnak*20;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTahun Masuk\t: "+this.tanggal()+"\nJumlah anak\t: "+jumlahAnak+"\nGaji\t\t: "+gaji;
    }
}
