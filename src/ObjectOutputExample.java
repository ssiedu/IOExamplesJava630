
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
    public static void main(String[] args) throws Exception {

        Student st=new Student(111, "AAA", "CS", 4);
        st.showInfo();
        System.out.println("Now Storing Object To File ");
        FileOutputStream fos=new FileOutputStream("e:/data/sinfo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st);
        oos.close();
        fos.close();
        System.out.println("Object Stored Successfully");
        System.out.println("Code Completed");
       
        
        
    }
}
