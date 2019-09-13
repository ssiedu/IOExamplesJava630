import java.io.File;
import java.util.Date;

public class FileInfoOne {

    public static void main(String[] args) {

        File f=new File("E:/data/abc/banner.png");
        long val=f.lastModified();
        System.out.println(val);
        Date dt=new Date(val);
        System.out.println(dt);
        
        //boolean b=f.exists();
        //boolean b=f.isFile();
        //boolean b=f.isHidden();
        //boolean b=f.canWrite();
        //System.out.println(b);
        
        //long val=f.length();
        //System.out.println(val);
    }
}
/*
    methods of File class   (non-static)
    ------------------------------------------

    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    boolean isHidden()
    boolean canWrite()
    String[] list()
    long lastModified()


*/
