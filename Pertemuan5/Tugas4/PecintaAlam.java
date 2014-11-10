package Pertemuan5.Tugas4;
public class PecintaAlam extends BEM {
    public void sifat(){
        System.out.println("Mampu menjaga Alam :D ");
    }
    public static void main(String[] args) {
        PecintaAlam ss = new PecintaAlam();
        MAHASISWA ab = new MAHASISWA();
        BEM as = new BEM();
        ss.sifat();
        ab.sifat();
        as.sifat();
    }
}


