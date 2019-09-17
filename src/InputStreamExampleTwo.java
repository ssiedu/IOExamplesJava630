
import java.io.FileInputStream;

public class InputStreamExampleTwo {

    public static void main(String[] args) throws Exception {

        //FileInputStream fis=new FileInputStream("e:/data/info.txt");
        FileInputStream fis = new FileInputStream("e:\\java4\\Demo.java");
        
        int n=fis.available();
        byte b[]=new byte[n];
        fis.read(b);
        String str=new String(b);
        System.out.println(str);
        

        fis.close();
    }
}
