package Pertemuan3;
public enum EnHargaBarang {
    Sabun(3000), Shampo(5000), Pastagigi(3500);
    int harga;
    
    private EnHargaBarang(int x){
        harga = x;
    }
    public int getHarga(){
        return harga;
    }
}
