package Pertemuan4.Tugas1;
public class Anak extends Ayah {
    public String nama = "Antoni";
    public void show(){
        System.out.println("Nama : "+nama);
        System.out.println("Mempunyai Hidung "+Hidung+" dan "
                + "mempunyai mata "+Mata+" serta"
                + " memiliki kulit "+Kulit);
    }
    public static void main(String[] args) {
        Anak zz = new Anak();
        zz.show();
    }
}
