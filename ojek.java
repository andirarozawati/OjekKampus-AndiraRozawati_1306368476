import java.util.*;
/**
 * Class untuk status dan lokasi mengenai driver Ojek Kampus
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ojek
{
     // status tersedia artinya bisa di booking
    private boolean tersedia;
    private Field field;
    private int nomerOjek;
    // posisi driver
    private Location location;
    //waktu dia tersedia
    protected int waktu;
    public static ArrayList<Layanan> layanan = new ArrayList<Layanan>();

    /**
     * Membuat objek baru driver
     */
    public ojek (Field field, Location location)
    {
       tersedia = true;
        this.field = field;
        setLocation(location);
    }
    
    public void listLayanan()
    {
        Layanan p1 = new Layanan ("01" , "Layanan Antar Go-Ojek","layanAntar");
        Layanan p2 = new Layanan ("02" , "Layanan Antar Barang", "layanBarang");
        Layanan p3 = new Layanan ("03" , "Layanan Pembelian ","layanBeli");
       
        layanan.add(p1);
        layanan.add(p2);
        layanan.add(p3);
       
        
    }
    
    public void daftarLayanan()
    {
        for (int i = 0; i < layanan.size(); i++)
        {
            System.out.println (" " +layanan.get(i).pname );
        }
    }
    
   
    abstract void cetakPrint();
    abstract void pesan();
    
    /**
     * menempatkan driver di suatu lokasi
     * 
     */
    protected void setLocation(Location newLocation)
    {
       
    }
    
    /**
     * Mengembalikan field driver
     * @return The animal's field.
     */
    protected Field getField()
    {
        return field;
    }
    
    abstract protected int getMaksWaktu();
    
    /**
     * Increase the age. This could result in the animal's death.
     */
    protected void mengurangiWaktu()
    {
        waktu++;
        if(waktu > getMaksWaktu()) {
            setTidakTersedia();
        }
    }
    
     /**
     * Driver sedang tidak tersedia
     * It is removed from the field.
     */
    protected void setTidakTersedia()
    {
        tersedia = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
}
