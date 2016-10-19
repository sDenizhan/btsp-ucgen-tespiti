package btspucgenkontrol;


public class Ucgen {
    
    /**
     * Hipotenüs teoreminden yararlanarak diküçgen olup olmadığını kontrol eder
     * 
     * @param kenar1
     * @param kenar2
     * @param kenar3
     * @return 
     */
    public static boolean isDikucgen(int kenar1, int kenar2, int kenar3)
    {
        boolean dikucgen = false;
        
        //kenar1 hipotenus ise
        if ( Math.pow(kenar1, 2) == ( Math.pow(kenar2,2) + Math.pow(kenar3, 2) ) )
        {
            dikucgen = true;
        }
        
        //kenar2 hipotenüs ise
        if ( Math.pow(kenar2, 2) == ( Math.pow(kenar1,2) + Math.pow(kenar3, 2) ) )
        {
            dikucgen = true;
        }
        
        //kenar üç ise
        if ( Math.pow(kenar3, 2) == ( Math.pow(kenar2,2) + Math.pow(kenar1, 2) ) )
        {
            dikucgen = true;
        }
        
        return dikucgen;
    }
    
    /**
     * Eşkenar Üçgen Kontrolü
     * 
     * @param kenar1
     * @param kenar2
     * @param kenar3
     * @return 
     */
    public static boolean isEskenar(int kenar1, int kenar2, int kenar3)
    {
        if ( kenar1 == kenar2 && kenar2 == kenar3 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * İkiz Kenar Kontrolü
     * 
     * @param kenar1
     * @param kenar2
     * @param kenar3
     * @return 
     */
    public static boolean isIkizKenar(int kenar1, int kenar2, int kenar3)
    {
        if ( kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
