/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

/**
 *
 * @author MNafis
 */
public class Employee implements Payable{
    private int registrationNumber,salaryPerMonth;
    private String name;
    private Invoice[] invoices;
    
    

    public Employee(int registrationNumber, int salaryPerMonth, String name) {
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
        this.name = name;        
    }
    public void Jenis(int banyakjenis){
        invoices = new Invoice[banyakjenis];
        for (int i = 0; i < banyakjenis; i++) {
            invoices[i] = new Invoice();            
        }
    }
    public void infobarang(int nomer, String productName, 
            int quantity, int pricePerItem){
        invoices[nomer].productName=productName;
        invoices[nomer].quantity=quantity;
        invoices[nomer].pricePerItem=pricePerItem;     
    }
    public double getPayableAmount(){
        double payableamount = 0;
        for (int i = 0; i < invoices.length; i++) {
            payableamount = payableamount + invoices[i].getPayableAmount();
        }
        return payableamount;
    }
    public double gajiSetelahbayar(){
        return salaryPerMonth-getPayableAmount();
    }
    public void display(){        
        System.out.println("Nama             :" + name);
        System.out.println("Nomer Registrasi : " + registrationNumber);
        System.out.println("Gaji per bulan   :" + salaryPerMonth);
        System.out.println("---------------------------------------------");
        System.out.println("        BARANG YANG ANDA BELI DI KOPRASI");
        System.out.println("---------------------------------------------");        
        System.out.printf("%-15s%-15s%-15s\n","Nama barang","Harga per item","Jumlah barang");
        for (int i = 0; i < invoices.length; i++) {   
            System.out.printf("%-15s%-15s%-15s\n",invoices[i].productName,invoices[i].pricePerItem,invoices[i].quantity);
        }
        System.out.println("---------------------------------------------");        
        System.out.println("pembelian barang di koprasi :" + getPayableAmount());
        System.out.println("Total gaji setelah dipotong :" + gajiSetelahbayar());
        System.out.println("---------------------------------------------");        
    }        
}


