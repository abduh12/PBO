package Pertemuan3.Tugas2;
public class EnumTest {
    Keluarga k;
    public EnumTest(Keluarga k) {
        this.k = k;
    }
    public void showKeluarga() {
        switch (k) {
            case AYAH:
                System.out.println("Sodiq");
                break;
                    
            case IBU:
                System.out.println("Gamar");
                break;
                         
            case ADIK:
                System.out.println("Afrah");
                break;
                
            case PAMAN:
                System.out.println("Ali");
                break;
                    
            case KAKEK:
                System.out.println("Said");
                break;
                        
            case NENEK:
                System.out.println("Sarifah");
                break;
                        
            default:
                System.out.println("");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest a = new EnumTest(Keluarga.AYAH);
        a.showKeluarga();
        EnumTest b = new EnumTest(Keluarga.IBU);
        b.showKeluarga();
        EnumTest c = new EnumTest(Keluarga.ADIK);
        c.showKeluarga();
        EnumTest d = new EnumTest(Keluarga.PAMAN);
        d.showKeluarga();
        EnumTest e = new EnumTest(Keluarga.KAKEK);
        e.showKeluarga();
        EnumTest f = new EnumTest(Keluarga.NENEK);
        f.showKeluarga();
    }
}
