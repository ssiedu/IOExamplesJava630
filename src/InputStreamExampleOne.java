
import java.io.FileInputStream;


public class InputStreamExampleOne {
    public static void main(String[] args) throws Exception {
        //reading the contents from info.txt
        
        //step-1 (open the stream)
        //FileInputStream fis=new FileInputStream("e:/data/info.txt");
        FileInputStream fis=new FileInputStream("e:\\java4\\Demo.java");
        //step-2 (read the data from stream)
        
        while(true){
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        //step-3 (close the file)
        fis.close();
    }
}
