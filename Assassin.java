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
public class Assassin extends Hero{
    private double lifesteal;
    
    public Assassin(String id,String name,double mh,double h,double bd,double sa){
        super(id,name,mh,h,bd);
        this.lifesteal=sa;
    }
    
    @Override
    public double serang(){
        return this.getBasicDamage();
    }
}
