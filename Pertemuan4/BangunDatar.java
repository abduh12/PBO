package Pertemuan4;
public class BangunDatar {
    private String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = "===== Bangun "+nama+" =====";
    }
    
    public void cetak(){
        System.out.println(nama);
    }
}
