package Pertemuan2;
public class Segitiga {
    
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungluas(){
        return ((alas*tinggi)/2);
    }
    
    public static void main(String[] args) {
        Segitiga ss = new Segitiga(2, 4);
        System.out.println(ss.hitungluas());
    }
}
