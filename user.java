import java.util.*;

/**
 * Class untuk user melakukan pemesanan menu akan gojek
 * 
 * @andira rozawati 1306368476
 * @2 juni 2016
 */
public class user
{
    // instance variables - replace the example below with your own
    public int nomerUser;
    public String username = "user";
    public static int chs;

    /**
     * Constructor for objects of class user
     */
    public user()
    {
        // initialise instance variables
       
    }

    public static void main (String[] args)
    {
        System.out.println ("Masukkan nomer menu yang anda inginkan: ");
        System.out.println ("1. Antar/Orang \n2. Barang \n3. Beli");
        Scanner s = new Scanner (System.in);
        chs = s.nextInt();
        switch (chs)
        {
            case 1:
                ojek t1 = new layanAntar();
                t1.pesan();
                break;
            case 2:
                ojek t2 = new layanBarang();
                t2.pesan();
                break;
            case 3:
               ojek t3 = new layanBeli();
               t3.pesan();
               break;       
         }
    }
}
