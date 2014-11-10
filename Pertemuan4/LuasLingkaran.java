package Pertemuan4;
public class LuasLingkaran extends BangunDatar{
    private double phi = 3.14;
    private double jari2;
    private double luas;
    
    
    public void setLuas(double phi, double jari2){
        this.phi = phi;
        this.jari2 = jari2;
        luas = phi*jari2*jari2;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Luas lingkaran dengan jari2 = "+jari2+" adalah "+luas);
        System.out.println("=========================================================================");
    }
}
