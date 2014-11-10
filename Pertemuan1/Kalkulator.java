package Pertemuan1;
import java.util.Scanner;
public class Kalkulator {
    public int a,b,hasil;
    String o;
    public void masukan(){
        Scanner ipt = new Scanner (System.in);
        System.out.println("=================");
        System.out.println(">>>>CALCULATOR<<<<");
        System.out.println("=================");
        System.out.print("Masukkan angka pertama : ");
        a = Integer.parseInt(ipt.nextLine());
        System.out.print("Masukkan Angka Kedua : ");
        b = Integer.parseInt(ipt.nextLine());
        System.out.print("Masukkan Operator(+,-,x,/) : ");
        o = ipt.nextLine();
        System.out.println("------------------");
    }
    public void hitung(){
        if (o.equals("+")) {
            hasil=a+b;
        }else if(o.equals("-")){
            hasil=a-b;
        }else if(o.equals("x")){
            hasil=a*b;
        }else if(o.equals("/")){
            hasil=a/b;
        }
        System.out.println("Hasil dari "+o+" adalah "+hasil);
    
    }
    
    public static void main(String[] args) {
   
        Kalkulator ab = new Kalkulator();
        ab.masukan();
        ab.hitung();
        
}
    
}
