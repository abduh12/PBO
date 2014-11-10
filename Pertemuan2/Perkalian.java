package Pertemuan2;
public class Perkalian {
    public int kali(int x, int y){
        return(x*y);
    }
    
    public double kali (double x, double y){
        return(x*y);
    }
    
    public static void main(String[] args) {
        Perkalian perkalian = new Perkalian();
        System.out.println("Hasil Method int : "+perkalian.kali(4.0, 5.0));
        System.out.println("Hasil Method double : "+perkalian.kali(4, 5));
        
    }
}