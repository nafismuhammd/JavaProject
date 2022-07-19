/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemastik1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MNafis
 */
public class Gemastik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int j=0;
        int waktu=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        n=in.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());  b.add(in.nextInt());
        }
        
        if (n==1) {
            waktu=a.get(0)+b.get(0);
            System.out.println(waktu);
        }else if (n<0 || n>100.000) {
            System.out.println("masukan salah");
        }else{
            for (int i = 0; i < n; i++) {
                j=j+a.get(i)+b.get(i);
            }
            waktu=n*j;
            System.out.println(waktu);
        }
        
        
        
        // TODO code application logic here
    }
    
}
