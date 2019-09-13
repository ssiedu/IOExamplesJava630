
import java.io.File;
import java.util.Scanner;


public class FileInfoTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Folder ");
        String fname=sc.next();
        File f=new File(fname);
        String s[]=f.list();
        
        for(String tmp:s){
            System.out.println(tmp);
        }
        
        
        
        
    }
}
