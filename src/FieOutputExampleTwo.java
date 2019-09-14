import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FieOutputExampleTwo {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give A File Name ");
        String filename=sc.next();
        File f=new File(filename);
        boolean found=f.exists();
        if(found==false){
            FileOutputStream fos=new FileOutputStream(filename);
            for(int i=65;i<=90;i++){
                fos.write(i);
            }
            fos.close();
            System.out.println("DATA STORED");
        }else{
            System.out.println(filename+" is already available");
        }
        
        
    }
}
/*
    OutputStream
    ---------------
    void write(int)
    void write(byte[])
    void write(byte[],int,int)
    void close()




*/