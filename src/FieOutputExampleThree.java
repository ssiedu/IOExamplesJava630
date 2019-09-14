import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FieOutputExampleThree {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give A File Name ");
        String filename=sc.next();
        System.out.println("Enter A City Name To Store To File");
        String city=sc.next();
        byte b[]=city.getBytes();
        FileOutputStream fos=new FileOutputStream(filename,true);
        //fos.write(b);
        fos.write(b, 0, 3);
        fos.close();
        
    }
}
/*
    OutputStream
    ---------------
    void write(int) //one by one byte
    void write(byte[])  //entire byte array
    void write(byte[],int,int)  //part of byte array
    void close()




*/