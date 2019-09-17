
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class InputStreamExampleFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name To Read : ");
        String fname = sc.next();

        try (FileInputStream fis = new FileInputStream(fname)) {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            System.out.println(new String(b));
        } catch (Exception e) {
            System.out.println("Problem Occures");
        }

        System.out.println("Now Deleting File...........!");
        File f = new File(fname);
        boolean res = f.delete();
        if (res == true) {
            System.out.println(fname + " remove successfully");
        } else {
            System.out.println("Cant remove " + fname);
        }

    }
}
