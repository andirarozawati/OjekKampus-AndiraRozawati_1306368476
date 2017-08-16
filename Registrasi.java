import java.util.*;

/**
 * Class untuk user melakukan pemesanan menu akan gojek
 * 
 * @andira rozawati 1306368476
 * @2 juni 2016
 */
public class Registrasi
{
    // instance variables - replace the example below with your own
    public int nomerUser;
    public String username = "user";
    public String pid;
    public String pname;
    public static int chs;
    public static ArrayList<tipeRegistrasi> tipe = new ArrayList<tipeRegistrasi>();

    /**
     * Constructor for objects of class user
     */
    public Registrasi()
    {
        // initialise instance variables
       
    }

    public static void main (String[] args)
    {
        System.out.println ("Masukkan nomer menu yang anda inginkan: ");
        System.out.println ("1. Regis Ojek \n2. Regis User ");
        Scanner s = new Scanner (System.in);
        chs = s.nextInt();
        switch (chs)
        {
            case 1:
                Registrasi t1 = new regisOjek();
             
                break;
            case 2:
                Registrasi t2 = new regisUser();
             
                break;
           
         }
    }
}
