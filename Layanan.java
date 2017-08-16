/**
 * Class untuk proses layanan 
 */


public class Layanan implements java.io.Serializable {
    
    public String pid;
    public String pname, type;

    public Layanan(){}
    public Layanan(String pid, String pname,String type) {
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
    

    public String toString() {
        String sep = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer();
        buffer.append(sep);
        buffer.append("----- Detail Layanan ----- ");
        buffer.append(sep);
    buffer.append("\tpid = ");
        buffer.append(pid);
        buffer.append(sep);
        buffer.append("\tpname = ");
        buffer.append(pname);
        buffer.append(sep);
        buffer.append("\ttype= ");
        buffer.append(type);
        buffer.append(sep);
        return buffer.toString();
    }//toString

}//class