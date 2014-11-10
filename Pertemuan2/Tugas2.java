package Pertemuan2;
import java.util.Scanner;
public class Tugas2 {
   public int NIM,angka; //mendeklarasikan variable
   public String nama;
   public double rumus(double angka, double NIM){ // method atau overload method karena 
        return (NIM/angka);                        // lebih dari 1 method dg nama sama
    }                                              // didalam 1 class
    
    public int rumus(int angka, int NIM){          // method atau overload method karena  
        return (NIM/angka);                        // lebih dari 1 method dg nama sama
    }                                              // didalam 1 class
   
   public void inputan(){ // method untuk inputan data
       Scanner ipt = new Scanner (System.in);
       System.out.print("Masukkan Nama anda : "); 
       nama = ipt.nextLine();
       System.out.print("Masukkan NIM anda : ");
       NIM = Integer.parseInt(ipt.nextLine());
       System.out.print("Masukkan ANGKA yg anda sukai : ");
       angka = Integer.parseInt(ipt.nextLine());
            
   }
   public void tampil(){ //method untuk menampilkan
       Tugas2 az = new Tugas2(); //objek
       System.out.println("");
       System.out.println("Nama anda adalah : "+nama);
       System.out.println("NIM anda adalah : "+NIM);
       System.out.println("Berdasarkan ramalan program ini kelak anda akan memiliki anak sebanyak : "+az.rumus(angka,NIM));
   }
    
    public static void main(String[] args) {
        Tugas2 ab = new Tugas2(); // objek
        System.out.println("===PROGRAM RAMALAN ISENG2===");
        ab.inputan(); //memanggil isi dari method inputan
        ab.tampil(); // memanggil isi dari method tampil
        System.out.println("============================");
        
    }
}
