import java.io.FileOutputStream;

public class FieOutputExample {
    public static void main(String args[]) throws Exception {
        
    //to write something to a file
    
    //step-1 (open a stream (OutputStream))
    FileOutputStream fos=new FileOutputStream("e:/data/mydata.txt",true);
    //step-2 (write data using stream)
    for(int i=97;i<=105;i++){
        fos.write(i);
    }
    //step-3 (close the file)
    fos.close();
    System.out.println("DATA STORED");
        
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