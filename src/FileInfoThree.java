import java.io.File;
import java.io.IOException;

public class FileInfoThree {
    public static void main(String[] args) throws IOException {

        File f=new File("e:/data/sample.txt");
        boolean b=f.createNewFile();
        
        /*
        File f1=new File("e:/data/abc");
        File f2=new File("e:/data/xyz");
        boolean b=f2.renameTo(f1);
        */
        
        //File f=new File("e:/data/abc");
        
        //boolean b=f.delete();
        
        //boolean b=f.mkdir();
        if(b==true){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
        
        
    }
}
/*
    boolean createNewFile()
    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    
*/