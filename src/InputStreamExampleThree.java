
import java.io.FileInputStream;

public class InputStreamExampleThree {

    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("e:/data/info.txt");

        System.out.println((char)fis.read());//A
        System.out.println((char)fis.read());//B
        System.out.println((char)fis.read());//C->D
        fis.skip(3);//D,E,F->G
        System.out.println((char)fis.read());//G
        System.out.println((char)fis.read());//H->I
        fis.skip(2);//I,J->K
        System.out.println((char)fis.read());//K
        System.out.println((char)fis.read());//L
        

        fis.close();
    }
}
