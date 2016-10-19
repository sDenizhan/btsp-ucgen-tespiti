package btspucgenkontrol;
public class BtspUcgenKontrol {

    public static void main(String[] args) {
        
        int kenar1 = 5;
        int kenar2 = 4;
        int kenar3 = 3;
        
        if ( Ucgen.isDikucgen(kenar1, kenar2, kenar3) )
        {
            System.out.println("Dik üçgen tespit edildi..!");
        }
        else if ( Ucgen.isEskenar(kenar1, kenar2, kenar3) )
        {
            System.out.println("Eşkenar Üçgen Tespit Edildi..!");
        }
        else if ( Ucgen.isIkizKenar(kenar1, kenar2, kenar3) )
        {
            System.out.println("İkiz Kenar Üçgen Tespit Edildi..!");
        }
        else
        {
            System.out.println("Normal Bir Üçgen Tespit Edildi..!");
        }
       
    }
    
}
