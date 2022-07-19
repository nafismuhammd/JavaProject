
package mainsiam;
public class Filkom extends mhs{
    
    
    public Filkom(String nama, String nim,String pass,double ipk){
        super(nama,nim,pass,ipk);
        this.beasiswa=0;
    }
    
    public final double ukt=9500000;
    private double beasiswa;
    
    public void setBeasiswa(double ipk){
        if (ipk>2) {
           this.beasiswa=ukt*20/100;  
        }else if (ipk>3&&ipk<=3.8) {
            this.beasiswa=ukt*30/100;
        }else if (ipk>3.8) {
            this.beasiswa=ukt*80/100;
        }else this.beasiswa=0;
    }

    public double getBeasiswa() {
        return beasiswa;
    }
    
    public double jumlahukt(){
        return ukt-beasiswa;
    }
    
}
