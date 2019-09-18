
import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("e:/data/sample.txt");
        fw.write("this data we are storing from java code using file writer");
        fw.close();
        System.out.println("DATA STORED");
        
        
    }
}
