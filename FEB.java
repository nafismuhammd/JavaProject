package mainsiam;
public class FEB extends mhs{
    
    public FEB(String nama, String nim,String pass,double ipk){
        super(nama,nim,pass,ipk);
    }
    public final double ukt=4500000;
    private double beasiswa;
    public void setBeasiswa(double ipk){
        if (ipk>2) {
           this.beasiswa=ukt*10/100;
        }else if (ipk>3&&ipk<=3.5) {
            this.beasiswa=ukt*30/100;
        }else if (ipk>3.5) {
            this.beasiswa=ukt*60/100; 
        }else this.beasiswa=0;
    }

    public double getBeasiswa() {
        return beasiswa;
    }
    
    public double jumlahukt(){
        return ukt-beasiswa;
    }
    
    
}
