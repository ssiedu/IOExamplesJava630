
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class DataOutputExample {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        
        FileOutputStream fos=new FileOutputStream("e:/data/einfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        for(int i=1; i<=3; i++){
            System.out.println("Enter Roll No of Student : "+i);
            int rno=sc.nextInt();
            System.out.println("Enter Marks   of Student : "+i);
            double marks=sc.nextDouble();
            
            dos.writeInt(rno);
            dos.writeDouble(marks);
            
        }
            
        dos.close(); fos.close();
        
        System.out.println("INFORMATION STORED SUCCESSFULLY");
    }
}
