import java.util.*;
public class PersonAge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age<13)System.out.println("the person is kid");
        else if (age>=13 && age<=19) System.out.println("the person is teen");
        else if(age>19) System.out.println("the person is adult");
    }
}
