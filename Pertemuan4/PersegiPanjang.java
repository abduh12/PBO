package Pertemuan4;
public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    private double luas;
    
    
    public void setLuas(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        luas = panjang*lebar;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Luas Persegi panjang dengan Panjang = "+panjang+" dan lebar = "+lebar+" adalah "+luas);
        System.out.println("=========================================================================");
    }
    
}
