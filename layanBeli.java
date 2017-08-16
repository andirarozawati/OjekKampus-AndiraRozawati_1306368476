import java.util.List;
import java.util.Iterator;
import java.util.Random;
/**
 * class ini digunakan untuk pilihan layanan menu layanan beli dari ojek kampus online
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class layanBeli extends ojek
{
    // instance variables - replace the example below with your own
    
    private static final int MAKS_WAKTU= 15;
    public double totalPrice, km, hargabarang,jumlah;
    public String buying;


    /**
     * Constructor for objects of class layanBeli
     */
    public layanBeli(boolean randomAge, Field field, Location location)
    {
        super(field, location);
        if(randomAge) {
            waktu = (MAKS_WAKTU);
            
        }
        else {
            waktu = 0;
            
        }
    }

    public void totalPrice()
    {
        for (int i = 0; i < layanan.size(); i++)
        {
            if (layanan.get(i).type.equals("layan Beli"))
            {
                if (layanan.get(i).pname.equals(buying))
                {
                            totalPrice = km*1500;
                            jumlah = hargabarang+totalPrice;
                            
                            System.out.println ("Harga Akhir "+totalPrice);
                       
                    }
                    else
                    {
                        System.out.println ("Maaf Driver tidak tersedia");
                        
                    }
                }
            }
        }
        
    public void pesan(){
    }
    
    protected int getMaksWaktu(){
        return MAKS_WAKTU;
    }
    
    public void cetakPrint()
    {
        listLayanan();
        System.out.println("Berikut Spesifikasi Layanan Pembelian ");
        for (int i = 0; i < layanan.size(); i++)
        {
            if (layanan.get(i).type.equals("layan Beli"))
            {
               
                System.out.println (" " +layanan.get(i).pname);
                System.out.println (" Silahkan Melakukan Pesan Driver");
            }
        }
    }
}
