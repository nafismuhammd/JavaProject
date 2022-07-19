/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap;

import java.util.Scanner;

/**
 *
 * @author MNafis
 */
public class Uap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String y=null;
        LLBubbleSort LL = new LLBubbleSort();
        Queue q = new Queue();
        do {
            
            System.out.print("Masukkan nama pegawai baru : ");
            String nama = in.nextLine();
            LL.addLast(nama);
            
            System.out.print("Ingin memasukkan data lagi? (y/n)");
            y = in.nextLine();
        
        } while (y.equals("y"));
        LL.BubbleSort();
        LL.cetak("Hasil : ");
        System.out.println("");
        System.out.println("Absen datang");
        for (int i = 0; i < LL.size; i++) {
            System.out.print("Masukkan id pegawai : ");
            String id = in.nextLine();
            LL.cek(id);
        }
        System.out.println("");
        System.out.println("");
        
        
        
        
    }
    
}
