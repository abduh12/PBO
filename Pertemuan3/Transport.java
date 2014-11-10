package Pertemuan3;
public class Transport {
    public void cetakTransport(){
        //inisialisasi variable baru
        EnTransport tpkapal;
        EnTransport tppesawat;
        //pengisian nilai pada masing-masing variable
        tpkapal = EnTransport.Kapal;
        tppesawat = EnTransport.Pesawat;
        //cetak variable
        System.out.println("Nilai dari variable tpkapal adalah "+tpkapal);
        System.out.println("Nilai dari variable tpkapal adalah "+tppesawat);
        
    }
    
    public void cetakTransport2(){
        //penggunaan values()
        System.out.println("Ini adalah penggunaan method values()");
        EnTransport trans[] = EnTransport.values();
        for(EnTransport t : trans)
            System.out.println(t);
        System.out.println("");
        //penggunaan value of
        System.out.println("Ini adalah penggunaan method valuesOf()");
        EnTransport et;
        et = EnTransport.valueOf("Pesawat");
        System.out.println("Kendaraan yang digunakan adalah "+et);
    }
    
    public static void main(String[] args) {
        Transport transport = new Transport();
        //transport.cetakTransport();
        transport.cetakTransport2();
        
    }
}
    