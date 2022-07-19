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
public class MainManusia {
    public static void main(String[] args) {
        Manusia m = new Manusia("nafis","123",true,true);
        System.out.println(m);
        System.out.println("");
        Manusia n = new Manusia("ani","111",false,true);
        System.out.println(n);
        System.out.println("");
        Manusia mp = new Manusia("nafis","123",true,false);
        System.out.println(mp);
        System.out.println("");
        MahasiswaFILKOM a = new MahasiswaFILKOM("175150200111008",2.5,"Muhammad Nafis","111",true,false);
        System.out.println(a);
        System.out.println("");
        MahasiswaFILKOM ab = new MahasiswaFILKOM("175150200111008",3.4,"Muhammad Nafis","111",true,false);
        System.out.println(ab);
        System.out.println("");
        MahasiswaFILKOM ac = new MahasiswaFILKOM("175150200111008",3.8,"Muhammad Nafis","111",true,false);
        System.out.println(ac);
        System.out.println("");
        Pekerja f = new Pekerja(1000,2016,3,1,2,"Muhammad Nafis","111",true,true);
        System.out.println(f);
        System.out.println("");
        Pekerja fq = new Pekerja(1000,2009,3,1,0,"Muhammad Nafis","111",true,false);
        System.out.println(fq);
        System.out.println("");
        Pekerja fc = new Pekerja(1000,1998,3,1,10,"Muhammad Nafis","111",true,true);
        System.out.println(fc);
        System.out.println("");
        Manager lo = new Manager("HRD",7500,2003,3,1,0,"Muhammad Nafis","111",true,false);
        System.out.println(lo);
        System.out.println("");
    }
    
}
