import java.util.concurrent.Callable;

public class ClassN {
    int a =4 ;
    String fname = "Nikita";
    String lname = "Sharma";

//        public static void main(String[] args) {
//            ClassN cn = new ClassN();
//            cn.a = 500;
//            System.out.println(cn.a);
//
//        }
public static void main(String[] args) {
    ClassN cnObj = new ClassN();
    ClassN cnObj1 = new ClassN();
    ClassN cnObj2 = new ClassN();
    cnObj2.a =50;
    System.out.println(cnObj2.a);
    System.out.println(cnObj1.a);
    System.out.println("Name: " + cnObj.fname + " " + cnObj.lname);
        }

}