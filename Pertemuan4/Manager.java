package Pertemuan4;
public class Manager extends Pegawai{
    public String department;
    
    public void IsiData(String n, String d){
        gaji = 2000000;    //gaji berakses kontrol public, dapat diakses disemua class
        nip = "102912982"; //nip berakses kontrol protected, dapat diakses oleh subclass
        alamat = "jalan ahmad yani No. 78"; //alamat berakses kontrol default
        nama = n; // terdapat kesalahan bahwa nama merupakan akses PRIVATE !
        department = d; //department merupakan data dari class manager sendiri:D
    }
    public void tampil(){
        System.out.println("Gaji = "+gaji);
        System.out.println("NIP = "+nip);
        System.out.println("Alamat = "+alamat);
        System.out.println("Nama = "+nama);
        System.out.println("Departemen = "+department);
    }
    
}
