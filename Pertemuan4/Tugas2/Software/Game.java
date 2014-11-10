package Pertemuan4.Tugas2.Software;
public class Game extends Software{
    public String jenis;
    public String tipe;

    public Game() {
    }

    public Game(int kode, String nama, String lisensi) {
        super(kode, nama, lisensi);
    }

    public Game(String jenis, String tipe, int kode, String nama, String lisensi) {
        super(kode, nama, lisensi);
        jenis = "offline";
        tipe = "Sport";
    }
    
    
    public String getJenis() {
        return jenis;
    }

    public String getTipe() {
        return tipe;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public void game(){
        System.out.println("Jenis : "+jenis);
        System.out.println("tipe : "+tipe);
    }
    
    
    
    
}
