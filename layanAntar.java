import java.util.List;
import java.util.Iterator;
import java.util.Random;
/**
 * Class untuk Layanan Antar Manusia Ojek Kampus
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class layanAntar extends ojek
{
    
     private static final int MAKS_WAKTU= 15;
     public String pname, buying;
     public double totalPrice, km, jumlah;

    /**
     * Constructor for objects of class layanAntar
     */
    public layanAntar(boolean randomAge, Field field, Location location)
    {
        super(field, location);
        if(randomAge) {
            waktu = MAKS_WAKTU;
            
        }
        else {
            waktu = 0;
            
        }
    }
    
     public void cetakPrint()
    {
        listLayanan();
        System.out.println("Berikut Spesifikasi Layanan Antar ");
        for (int i = 0; i < layanan.size(); i++)
        {
            if (layanan.get(i).type.equals("layan Antar"))
            {
               
                System.out.println (" " +layanan.get(i).pname);
                System.out.println (" Silahkan Melakukan Pesan Driver");
            }
        }
    }
    
    public void pesan()
    {
    }
    
    protected int getMaksWaktu(){
        return MAKS_WAKTU;
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

