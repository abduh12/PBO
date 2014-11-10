package Pertemuan3.Tugas3;
import java.util.Scanner;
public class EnumTest {
    Rumus p;
    public EnumTest(Rumus p) {
        this.p = p;
    }
    public int c = 3*(10*8); int a;int b;
    public double g = 9.8;
   
    public void inp(){
        Scanner ipt = new Scanner (System.in);
        System.out.println("");
        System.out.print("Masukkan Energi : ");
        a = Integer.parseInt(ipt.nextLine());
        System.out.println("Rumus Energi adalah E = m*c2");
        System.out.println("Hasilnya adalah "+a*c);
        System.out.println("");
        System.out.print("Masukkan Berat : ");
        b = Integer.parseInt(ipt.nextLine());
        System.out.println("Rumus Berat adalah W = m*g");
        System.out.println("Hasilnya adalah "+b*c);
    }
    
     public void showKonstanta() {
        
        switch (p) {
            case KECEPATANCAHAYA:
                System.out.println("c = 3 x 10^8 m/s");
                break;
                    
            case KONSTANTAGRAVITASI:
                System.out.println("G = 6,673 x 10^-11 N.m^2/kg");
                break;
                         
            case PERCEPATANGRAVITASI:
                System.out.println("g = 9,8 kg.m/s2");
                break;
                
            case KONSTANTAPLANCK:
                System.out.println("6,626 x 10-34J.s h = 6,626 x 10^-34J.s.H");
                break;
                                            
            default:
                System.out.println("");
                break;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("=====Enum Dari Konstanta Fisika======");
        EnumTest a1 = new EnumTest(Rumus.KECEPATANCAHAYA);
        a1.showKonstanta();
        EnumTest a2 = new EnumTest(Rumus.KONSTANTAGRAVITASI);
        a2.showKonstanta();
        EnumTest a3 = new EnumTest(Rumus.PERCEPATANGRAVITASI);
        a3.showKonstanta();
        EnumTest a4 = new EnumTest(Rumus.KONSTANTAPLANCK);
        a4.showKonstanta();
        a1.inp();
     }

}
