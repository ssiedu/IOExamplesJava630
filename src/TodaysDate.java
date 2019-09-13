
import java.util.Date;


public class TodaysDate {

    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt);
        long val=dt.getTime();
        System.out.println(val);
    }
}
