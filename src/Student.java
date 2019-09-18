public class Student implements java.io.Serializable {

    private int rno;
    private String name;
    private transient String branch;
    private transient int sem;
    
    public Student(int a, String b, String c, int d){
        rno=a; name=b; branch=c; sem=d;
    }
    public void showInfo(){
        System.out.println("__________________________");
        System.out.println("Roll No  : "+rno);
        System.out.println("Name     : "+name);
        System.out.println("Branch   : "+branch);
        System.out.println("Semester : "+sem);
        System.out.println("__________________________");
    }
    
}
