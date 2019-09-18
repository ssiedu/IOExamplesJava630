
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExample {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("e:/data/einfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 1; i <= 3; i++) {

            int v1 = dis.readInt();
            double v2 = dis.readDouble();
            System.out.println("Roll No of Student : "+i+" : "+v1);
            System.out.println("Marks of Student   : "+i+" : "+v2);

        }
        dis.close();
        fis.close();
        
    }
}