package mainsiam;
public class FISIP extends mhs{
    
    public FISIP(String nama, String nim,String pass,double ipk){
        super(nama,nim,pass,ipk);
    }
    public final double ukt=7500000;
    private double beasiswa;
    
    public void setBea(double ipk){
        if (ipk>1.5) {
           this.beasiswa=ukt*20/100;
        }else if (ipk>2&&ipk<=3.2) {
            this.beasiswa=ukt*40/100;
        }else if (ipk>3.2) {
            this.beasiswa=ukt;     
        }else this.beasiswa=0;
    }
    


    public double getBeasiswa() {
        return beasiswa;
    }
    
    public double jumlahukt(){
        return ukt-beasiswa;
    }
    
}
