package Pertemuan2;
public class kotak {
    double panjang;
    double lebar;
    double tinggi;
    //mendefinisikan konstruktor dengan parameter
    public kotak(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public double hitungVoulume(){
        return(panjang*lebar*tinggi);
    }
    public kotak(double sisi){
        panjang = lebar = tinggi = sisi;
    }
    public kotak (){
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    public static void main(String[] args) {
    kotak kotak1 = new kotak(2,3,4);
    kotak kotak2 = new kotak(4);
    kotak kotak3 = new kotak();
    System.out.println("Volume kotak I : "+kotak1.hitungVoulume());
    System.out.println("Volume kotak 2 : "+kotak2.hitungVoulume());
    System.out.println("Volume kotak 3 : "+kotak3.hitungVoulume());
    }
}
