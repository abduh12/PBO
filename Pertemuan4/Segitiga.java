package Pertemuan4;
public class Segitiga extends BangunDatar{
    
    private double luas;
    private double tinggi;
    private double alas;
    
    public void setLuas(double tinggi, double alas){
        this.tinggi = tinggi;
        this.alas = alas;
        luas = tinggi*alas/2;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Luas Segitiga dengan alas = "+alas+" dan tinggi = "+tinggi+" adalah "+luas);
        System.out.println("=========================================================================");
    }
    
}
