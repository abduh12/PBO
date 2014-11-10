package Pertemuan4;
public class Persegi extends BangunDatar {
    private double sisi;
    private double luas;
    
    public void setLuas(double sisi) {
        this.sisi = sisi;
        luas = sisi*sisi;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Luas persegi dengan sisi = "+sisi+" adalah = "+luas);
        System.out.println("=================================");
    }
    
}
