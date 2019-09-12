import java.io.File;

public class FileInfoOne {

    public static void main(String[] args) {

        File f=new File("E:/data/abc");
        //boolean b=f.exists();
        boolean b=f.isFile();
        System.out.println(b);
        
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




*/
