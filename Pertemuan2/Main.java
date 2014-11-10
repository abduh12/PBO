package Pertemuan2;
public class Main {
    String Merk;
    int RAM,HDD,harga,diskon=30;
    double inch;
    public Main(int RAM, int harga){ // constructor atau overload constructor karena 
        this.RAM = RAM;     // lebih dari 1 constructor didalam 1class
        this.harga = 50000;
    }
    public Main(){       // constructor atau overload constructor karena 
        RAM = 0;           // lebih dari 1 constructor didalam 1class
    }
    public double Diskon(double harga, double diskon){ // method atau overload method karena 
        return (harga/diskon);                        // lebih dari 1 method dg nama sama
    }                                              // didalam 1 class
    public int Diskon(int harga, int diskon){          // method atau overload method karena  
        return (harga/diskon);                        // lebih dari 1 method dg nama sama
    }
    public void informasi(int h, int R, int H){
        this.harga = h;
        RAM = 2048;
        HDD = 1024;
    }
    public void informasi2(){
        Merk = "SONY";
        inch = 5.5;
    }
    public void tampil(){
        Main gg = new Main();
        System.out.println("Informasi Laptop Merk "+Merk);
        System.out.println("Harga = "+harga);
        System.out.println("===Spesifikasi===");
        System.out.println("Ukuran Layar = "+inch+"inch");
        System.out.println("RAM = "+RAM);
        System.out.println("Hard disk = "+HDD);
        System.out.println("Harga memiliki Diskon : "+gg.Diskon(harga, diskon)+"%");
    }
    public static void main(String[] args) {
        Main lepi = new Main();
        lepi.informasi(6000000, 2048, 1024);
        lepi.informasi2();
        lepi.tampil();
        
    }
    
    
  
    
}
