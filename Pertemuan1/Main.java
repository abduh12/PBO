package Pertemuan1;
public class Main {
    String Merk;
    int RAM,HDD,harga;
    double inch;
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
        System.out.println("Informasi Laptop Merk "+Merk);
        System.out.println("Harga = "+harga);
        System.out.println("===Spesifikasi===");
        System.out.println("Ukuran Layar = "+inch+"inch");
        System.out.println("RAM = "+RAM);
        System.out.println("Hard disk = "+HDD);
    }
    public static void main(String[] args) {
        Main lepi = new Main();
        lepi.informasi(6000000, 2048, 1024);
        lepi.informasi2();
        lepi.tampil();
    }
    
    
  
    
}
