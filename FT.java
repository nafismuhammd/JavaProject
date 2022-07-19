package mainsiam;
public class FT extends mhs{
    
    public FT(String nama, String nim,String pass,double ipk){
        super(nama,nim,pass,ipk);
    }
    
    public final double ukt=5500000;
    private double beasiswa;
    
    public void setBeasiswa(double ipk){
        if (ipk>1.5) {
           this.beasiswa=ukt*20/100;
        }else if (ipk>2&&ipk<=3) {
            this.beasiswa=ukt*30/100;
        }else if (ipk>3) {
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
