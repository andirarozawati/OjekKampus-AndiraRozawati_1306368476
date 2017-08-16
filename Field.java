import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Field untuk lokasi ojek dalam bentuk kotak.
 * 
 */
public class Field
{
    private int depth, width;
    private Object[][] field;

    /**
     * Constructor Field
     */
    public Field(int depth, int width)
    {
        this.depth = depth;
        this.width = width;
        field = new Object[depth][width];
    }
    
    /**
     * Menghapus isi Field
     */
    public void clear()
    {
       
    }
    
    /**
     * Menghapus Lokasi
     * @param location untuk di hapus
     */
    public void clear(Location location)
    {
        
    }
    
    /**
     * Menempatkan Ojek dalam posisi tertentu
     *
     */
    public void place(Object ojek)
    {
        
    }
    
    
    
    /**
     * Mengembalikan Depth 
     * 
     */
    public int getDepth()
    {
        return depth;
    }
    
    /**
     * Mengambalikan Lebar
     */
    public int getWidth()
    {
        return width;
    }
}
