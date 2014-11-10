package Pertemuan4;
public class HitungBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setNama("Persegi");
        persegi.setLuas(10);
        persegi.cetak();
        System.out.println("");
        Segitiga segitiga = new Segitiga();
        segitiga.setNama("Segitiga");
        segitiga.setLuas(5, 10);
        segitiga.cetak();
        System.out.println("");
        Segitiga PersegiPanjang = new Segitiga();
        PersegiPanjang.setNama("PersegiPanjang");
        PersegiPanjang.setLuas(5, 10);
        PersegiPanjang.cetak();
        System.out.println("");
        Segitiga JajarGenjang = new Segitiga();
        JajarGenjang.setNama("jajarGenjang");
        JajarGenjang.setLuas(5, 10);
        JajarGenjang.cetak();System.out.println("");
        Segitiga Lingkaran = new Segitiga();
        Lingkaran.setNama("Lingkaran");
        Lingkaran.setLuas(5, 10);
        Lingkaran.cetak();
        
    }
    
}
