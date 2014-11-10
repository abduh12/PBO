package Pertemuan3.Tugas1;
public enum EnBulan {
    Januari(31), Februari(28), Maret(31), April(30), Mei(31), Juni(30), Juli(31), Agustus(31), 
    September(30), Oktober(31), November(30), Desember(31);
    
    int bulan;
    
    private EnBulan(int x){
        bulan = x;
    }
    public int getBulan(){
        return bulan;
    }
}
