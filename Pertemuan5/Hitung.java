package Pertemuan5;

import java.util.Scanner;

public class Hitung {
    public double getHitung(){
        double x;
        Scanner i = new Scanner (System.in);
        Angka angka = new Angka();
        angka.setX(Integer.parseInt(i.nextLine()));
        angka.setY(Integer.parseInt(i.nextLine()));
        x = (double) angka.getX()/angka.getY();
        return x;
    }
    public static void main(String[] args) {
        Hitung hitung = new Hitung();
        System.out.println("Nilai dari konstanta phi adalah "+hitung.getHitung());
    }
    
}
