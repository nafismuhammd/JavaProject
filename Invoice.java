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
public class Invoice implements Payable{
    String productName;
    int quantity,pricePerItem;
    
    public Invoice() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String ProductName) {
        this.productName = ProductName;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerIterm(int ppi) {
        this.pricePerItem = ppi;
    }
    public double getPayableAmount(){
        return quantity*pricePerItem;
    }  
}

