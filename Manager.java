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
public class Manager extends Pekerja{
    private String departemen;
    
    public Manager(String departemen,double gaji,int tahun,int bulan,int tanggal,int jmlank,String nama,String nik,boolean jk,boolean m){
        super(gaji,tahun,bulan,tanggal,jmlank,nama,nik,jk,m);
        this.departemen=departemen;
    }
    
    public double getTunjangan(){
        return this.getGaji()*10/100;
    }
    
    @Override
    public double getPendapatan(){
        return super.getPendapatan()+this.getTunjangan();
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nDepartemen\t: "+departemen;
    }
}
