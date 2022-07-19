/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author MNafis
 */
public class Tank extends Hero{
    private double armor;
    
    public Tank(String id,String name,double mh,double h,double bd,double sa){
        super(id,name,mh,h,bd);
        this.armor=sa;
    }

    public double getArmor() {
        return armor;
    }
    
    
    
    @Override
    public double serang(){
        return this.armor;
    }
}
