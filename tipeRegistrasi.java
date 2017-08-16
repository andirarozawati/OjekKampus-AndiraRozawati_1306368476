
/**
 * Write a description of class Produk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class tipeRegistrasi implements java.io.Serializable {
    
    public String pid;
    public String pname, type;
    

    public tipeRegistrasi(){}
    public tipeRegistrasi (String pid, String pname, String type) {
        this.pid = pid;
        this.pname = pname;
        this.type = type;
    }
    
    public void setPid(String pid) {
        this.pid = pid; 
    }

    public void setPname(String pname) {
        this.pname = pname; 
    }

    public void setType()
    {
        this.type =type;
     }

    public String getPid() {
        return (this.pid); 
    }

    public String getPname() {
        return (this.pname); 
    }
    
    public String getType()
    {
        return type;
    }
    
    
   

}//class