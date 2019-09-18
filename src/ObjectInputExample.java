
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {
    public static void main(String[] args) throws Exception {

        System.out.println("Reading An Object From A File : ");
        FileInputStream fis=new FileInputStream("e:/data/sinfo.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student)ois.readObject();
        s.showInfo();
        ois.close();
        fis.close();
    }
}
