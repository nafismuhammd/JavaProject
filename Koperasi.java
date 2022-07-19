/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;
import java.util.Scanner;
/**
 *
 * @author MNafis
 */
public class Koperasi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, namaProduk;
        int nomorRegistrasi, gajiPerBulan, banyakJenis, banyak, hargaProduk;
        Scanner input = new Scanner(System.in);
        System.out.println("INFORMASI KARYAWAN");
        System.out.print("Nama              : ");
        nama = input.nextLine();
        System.out.print("Nomor Registrasi  : ");
        nomorRegistrasi = input.nextInt();
        System.out.print("Gaji per Bulan    : ");
        gajiPerBulan = input.nextInt();
        System.out.println("");
        Employee employee = new Employee(nomorRegistrasi, gajiPerBulan, nama);
        System.out.print("Banyak Jenis Barang yang dibeli : ");
        banyakJenis = input.nextInt();
        employee.Jenis(banyakJenis);
        for (int i = 0; i < banyakJenis; i++) {
            System.out.print("Nama barang ke-" + (i + 1) + ": ");
            input.nextLine();
            namaProduk = input.nextLine();
            System.out.print("Banyak " + namaProduk + " yang dibeli : ");
            banyak = input.nextInt();
            System.out.print("Harga " + namaProduk + " : ");
            hargaProduk = input.nextInt();
            employee.infobarang(i, namaProduk, banyak, hargaProduk);
        }
        System.out.println("----------------------------------------------------");
        employee.display();
    }

}
