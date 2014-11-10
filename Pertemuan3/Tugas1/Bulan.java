package Pertemuan3.Tugas1;
public class Bulan {
    public void showBulan(){
        System.out.println("=============");
        for (EnBulan a : EnBulan.values()) {
            System.out.println(a+" : "+a.getBulan());
        }
    }
    
    public static void main(String[] args) {
        Bulan zz = new Bulan();
        zz.showBulan();
    }
    
    
}
