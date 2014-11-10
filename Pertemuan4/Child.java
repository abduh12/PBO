package Pertemuan4;
public class Child extends Parent{
    public int x =10;
    public void info(int x){
        System.out.println("Nilai x sebagai parameter = "+x);
        System.out.println("Data member x di Class = "+this.x);
        System.out.println("Data member x di Parent"+super.x);
    }
}
