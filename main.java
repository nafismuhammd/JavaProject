package mainsiam;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int h=0,o=0;
        
        Scanner in = new Scanner(System.in);
        
        FT matek = new FT("Rendy","175060202","123",3.4);
        Filkom mafil = new Filkom("Nanda","175150402","123",3.3);
        FISIP mafis = new FISIP("Cegy","175170501","123",3.0);
        FEB mafeb = new FEB("Nafis","175080301","123",3.2);
        for (int i = 0; i < 2; i++) {
            System.out.println("LOGIN");
            System.out.print("Masukkan nim\t: ");
            String nim=in.nextLine();
            System.out.print("Masukkan pass\t: ");
            String p=in.nextLine();
            if (nim.charAt(3)=='1'&&nim.charAt(4)=='5') {
                mafil.login(nim, p, i);o=1;
            }else if (nim.charAt(3)=='0'&&nim.charAt(4)=='6') {
                matek.login(nim, p, i);o=2;
            }else if (nim.charAt(3)=='1'&&nim.charAt(4)=='2') {
                mafis.login(nim, p, i);o=3;
            }else if (nim.charAt(3)=='0'&&nim.charAt(4)=='2') {
                mafeb.login(nim, p, i);o=4;
            }else System.out.println("nim salah");
        }
        if (mhs.masuk==true) {
            System.out.println("Anda Telah Login");
            System.out.println("");
            System.out.println("");
            do{
            System.out.println("1. Tampilkan ");
            System.out.println("2. Jumlah UKT");
            System.out.println("3. Beasiswa Diperoleh");
            System.out.println("4. Exit");
            System.out.print("Pilihan : ");
            int g = in.nextInt();
            switch(g){
                case 1:
                    if (o==1) {
                        mafil.Tampilkan();
                    }else if (o==2) {
                        matek.Tampilkan();
                    }else if (o==3) {
                        mafis.Tampilkan();
                    }else if (o==4) {
                        mafeb.Tampilkan();
                    }
                    break;
                case 2:
                    if (o==1) {
                        mafil.jumlahukt();
                    }else if (o==2) {
                        matek.jumlahukt();
                    }else if (o==3) {
                        mafis.jumlahukt();
                    }else if (o==4) {
                        mafeb.jumlahukt();
                    }
                    break;
                case 3:
                    if (o==1) {
                        mafil.getBeasiswa();
                    }else if (o==2) {
                        matek.getBeasiswa();
                    }else if (o==3) {
                        mafis.getBeasiswa();
                    }else if (o==4) {
                        mafeb.getBeasiswa();
                    }
                    break;
                case 4:
                    h=99;
                    break;
                default:
                    System.out.println("Masukkan salah");
                    h=99;
                    break;
            }
            }while(h==99);
            
        }else {
            System.out.println("Login gagal,Akun anda telah diblokir");
            mafil.blokir();
        }
 
    }
    
}
