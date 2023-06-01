import java.lang.*;
import java.util.Scanner;
public class Student {
    String Name="Name1";
     String getName(){
        System.out.println("This is getName function and the value in the name is: "+Name);
     return Name;
    }
    void setName(String s){
        String temp=Name;
         Name=s;
        System.out.println(temp.equals(Name) ? "Value is not updated" : "Still the value of the variable is"+Name);
    }
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("We are Calling getName()");
        obj.getName();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to update the state variable Name");
        String newName=sc.nextLine();
        System.out.println("Now we are calling setName() by passing the argument as "+newName);
        obj.setName(newName);
        System.out.println("Lets now check the value by calling getName(): ");
        obj.getName();


    }
}