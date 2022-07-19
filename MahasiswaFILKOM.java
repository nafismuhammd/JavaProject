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
public class MahasiswaFILKOM extends Manusia{

    private String nim;
    private double ipk;
    
    
    
    public MahasiswaFILKOM(String nim,double ipk,String nama,String nik,boolean jk,boolean m){
        super(nama,nik,jk,m);
        this.nim=nim;
        this.ipk=ipk;
    }
    
    @Override
    public double getPendapatan(){
        return super.getPendapatan()+this.getBeasiswa();
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nnim\t\t: "+nim+"\nipk\t\t: "+ipk+"\nstatus\t\t: "+this.getStatus();
    }
    
    
    public String getStatus(){
        String prodi=null;
        switch(Integer.parseInt(String.valueOf(nim.charAt(6)))){
            case 2 :
                prodi = "Teknik Informatika";break;
            case 3 :
                prodi = "Teknik Komputer";break;
            case 4 :
                prodi = "Sistem Informasi";break;
            case 6 : 
                prodi = "Pendidikan Teknologi Informasi";break;
            case 7 : 
                prodi = "Teknologi Informasi";break;
            default :
                break;
        }
        
        return prodi+", 20"+nim.charAt(0)+nim.charAt(1);
    }
    
    
    public double getBeasiswa(){
        if (ipk>3.5) {
            return 75;
        }else if (ipk>=3 && ipk <=3.5) {
            return 50;
        }else return 0;
    }    
}
