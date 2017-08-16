import java.util.List;
import java.util.Iterator;
import java.util.Random;
/**
 * Write a description of class layanBarang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class layanBarang extends ojek
{
    // instance variables - replace the example below with your own
    
     private static final int MAKS_WAKTU= 15;
     public double totalPrice, km, hargabarang,jumlah;
     public String buying;

    /**
     * Constructor for objects of class layanBarang
     */
    public layanBarang(boolean randomAge, Field field, Location location)
    {
        super(field, location);
        if(randomAge) {
            waktu = MAKS_WAKTU;
            
        }
        else {
            waktu = 0;
            
        }
    }

   
    protected int getMaksWaktu(){
        return MAKS_WAKTU;
    }
    
    public void pesan(){
    }
    
    public void cetakPrint()
    {
        listLayanan();
        System.out.println("Berikut Spesifikasi Layanan Barang ");
        for (int i = 0; i < layanan.size(); i++)
        {
            if (layanan.get(i).type.equals("layan Barang"))
            {
               
                System.out.println (" " +layanan.get(i).pname);
                System.out.println (" Silahkan Melakukan Pesan Layanan Barang");
            }
        }
       
    }
    
    
    public void totalPrice()
    {
        for (int i = 0; i < layanan.size(); i++)
        {
            if (layanan.get(i).type.equals("layan Antar"))
            {
                if (layanan.get(i).pname.equals(buying))
                {
                            totalPrice = km*1500;
                            
                            System.out.println ("Harga Akhir "+totalPrice);
                       
                    }
                    else
                    {
                        System.out.println ("Maaf Driver tidak tersedia");
                        
                    }
                }
            }
        }
}
