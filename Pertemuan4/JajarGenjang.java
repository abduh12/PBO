package Pertemuan4;
public class JajarGenjang extends BangunDatar{
    private double alas;
    private double tinggi;
    private double luas;
    
    
    public void setLuas(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        luas = alas*tinggi;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Luas jajar genjang dengan alas = "+alas+" dan tinggi = "+tinggi+" adalah "+luas);
        System.out.println("=========================================================================");
    }
}
