import java.util.Scanner;

public class StaticBlockExample {
    static int var;
    static{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the a value:");
        var=sc.nextInt();
    }
    static int Fun(){

        return var;
    }
    public static void main(String[] args) {
        StaticBlockExample o= new StaticBlockExample();

        System.out.println("value of var is "+o.Fun());
    }
}