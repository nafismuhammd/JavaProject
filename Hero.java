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
public abstract class Hero {
    private String id;
    private String name;
    private double maxHealth,Health,basicDamage;
    
    public Hero(String id,String name,double mh,double h,double bd){
        this.id=id;
        this.name=name;
        this.basicDamage=bd;
        this.Health=h;
        this.maxHealth=mh;
    }
    public abstract double serang();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public double getHealth() {
        return Health;
    }

    public double getBasicDamage() {
        return basicDamage;
    }

    public void setHealth(double Health) {
        this.Health = Health;
    }
    
    
}
