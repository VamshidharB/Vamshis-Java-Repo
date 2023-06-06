import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int a=0,b=1,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.printf(a+" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.printf(" "+c);
            a=b;
            b=c;

        }

    }
}
