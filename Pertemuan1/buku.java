package Pertemuan1;
class book{
    int price;
    int pages;
    
    public void set(int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    
    public void show(){
        System.out.println("Books Information");
        System.out.println("Book Price"+price);
        System.out.println("NUmber of Pages"+pages);
    }
}

public class buku {
    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }
    
}
