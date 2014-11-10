package Pertemuan4.Tugas2.Software;
public class Software {
    public int kode;
    public String nama;
    public String lisensi;

    public Software() {
        
    }

    public Software(int kode, String nama, String lisensi) {
        kode = 1;
        nama = "NFS(Need For Speed)";
        lisensi = "komersil";
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLisensi() {
        return lisensi;
    }

    public void setLisensi(String lisensi) {
        this.lisensi = lisensi;
    }
    
    public void Software(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama : "+nama);
        System.out.println("Lisensi : "+lisensi);
    }
    
}
