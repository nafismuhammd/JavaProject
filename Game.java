/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author MNafis
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tank Hylos = new Tank("Tank","Hylos",100,100,10,30);
        Tank Akai = new Tank("Tank","Akai",100,100,15,40);
        Archer miya = new Archer("Archer", "Miya", 100,100, 50, 40);
        Archer moskov = new Archer("Archer", "Moskov", 100,100, 30, 70);
        Assassin fanny = new Assassin("Assassin", "Fanny", 100, 100, 25, 80);
        Assassin haya = new Assassin("Assassin", "Hayabusha", 100, 100, 50, 10);
        Hero hr[]=new Hero[2];
        
        System.out.println("Pilih hero untuk menyerang : ");
        System.out.println("1. Fanny");
        System.out.println("2. Hayabusha");
        System.out.println("3. Hylos");
        System.out.println("4. Akai");
        System.out.println("5. Miya");
        System.out.println("6. Moskov");
        System.out.print("Masukkan pilihan : ");
        int plh = in.nextInt();
        switch(plh){
            case 1 :
                hr[0]=fanny;break;
            case 2 :
                hr[0]=haya;break;
            case 3 :
                hr[0]=Hylos;break;
            case 4 :
                hr[0]=Akai;break;
            case 5 :
                hr[0]=miya;break;
            case 6 :
                hr[0]= moskov;break;
        }
        
        System.out.println("Pilih hero untuk diserang");
        System.out.println("1. Fanny");
        System.out.println("2. Hayabusha");
        System.out.println("3. Hylos");
        System.out.println("4. Akai");
        System.out.println("5. Miya");
        System.out.println("6. Moskov");
        System.out.print("Masukkan pilihan : ");
        int plh1 = in.nextInt();
        switch(plh1){
            case 1 :
                hr[1]=fanny;break;
            case 2 :
                hr[1]=haya;break;
            case 3 :
                hr[1]=Hylos;break;
            case 4 :
                hr[1]=Akai;break;
            case 5 :
                hr[1]=miya;break;
            case 6 :
                hr[1]= moskov;break;
        }
        System.out.println("");
        System.out.println(hr[0].getId()+" "+hr[0].getName()+"(Health : "+hr[0].getHealth()+"/"+hr[0].getMaxHealth()+", Basic Attack : "+hr[0].getBasicDamage()+")");
        System.out.println(hr[1].getId()+" "+hr[1].getName()+"(Health : "+hr[1].getHealth()+"/"+hr[1].getMaxHealth()+", Basic Attack : "+hr[1].getBasicDamage()+")");
        
        hr[1].setHealth(hr[1].getHealth()-hr[0].serang());
        
        System.out.println("");
        System.out.println("");
        System.out.println("Hasil pertempuran : ");
        System.out.println(hr[0].getId()+" "+hr[0].getName()+"(Health : "+hr[0].getHealth()+"/"+hr[0].getMaxHealth()+", Basic Attack : "+hr[0].getBasicDamage()+")");
        System.out.println(hr[1].getId()+" "+hr[1].getName()+"(Health : "+hr[1].getHealth()+"/"+hr[1].getMaxHealth()+", Basic Attack : "+hr[1].getBasicDamage()+")");
    }
    
}
