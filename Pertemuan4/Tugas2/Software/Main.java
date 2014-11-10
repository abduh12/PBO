package Pertemuan4.Tugas2.Software;
import java.util.Scanner;
public class Main extends Game {
   public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        Main az = new Main();
        System.out.print("Masukkan kode game : ");
        az.setKode(Integer.parseInt(i.nextLine()));
        System.out.print("Masukkan Lisensi : ");
        az.setLisensi(i.nextLine());
        System.out.print("Masukkan Nama Game : ");
        az.setNama(i.nextLine());
        System.out.print("Masukkan Jenis Game : ");
        az.setJenis(i.nextLine());
        System.out.print("Masukkan Tipe Game : ");
        az.setTipe(i.nextLine());
        System.out.println("");
        az.Software();az.game();
    }
}
