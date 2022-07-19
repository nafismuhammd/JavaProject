package mainsiam;
public class mhs {
    private String nama;
    private String nim;
    private String pass;
    private double ipk;
    public static boolean masuk=false;
    
    public mhs(String nama,String nim,String pass,double ipk){
        this.ipk=ipk;
        this.nama=nama;
        this.nim=nim;
        this.pass=pass;
        
    }
         
    public void blokir(){
        this.ipk=0;
        this.nama=null;
        this.nim=null;
        this.pass=null;
    }
    
    public void login(String nim,String p,int y){
        if (this.nim.equals(nim)) {
            if (this.pass.equals(p)) {
                masuk=true;
                y+=7;
            }else System.out.println("Password salah");   
        }else System.out.println("NIM Salah");
    }
    
    public void Tampilkan(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("NIM\t\t: "+nim);
        System.out.println("IPK\t\t: "+ipk);
    }
    
    
    
}
