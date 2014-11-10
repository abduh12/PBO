package Pertemuan3;
public class HargaBarang {
    public void cetakHargaBarang(){
        System.out.println("Harga sabun adalah : "+EnHargaBarang.Sabun.getHarga());
        System.out.println("Harga masing-masing barang adalah ");
        for(EnHargaBarang hb : EnHargaBarang.values()){
            System.out.println(hb+" : "+hb.getHarga());
        }
    }
    public static void main(String[] args) {
        HargaBarang hargabarang = new HargaBarang();
        hargabarang.cetakHargaBarang();
    }
}
