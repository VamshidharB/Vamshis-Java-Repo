import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        long num=sc.nextInt();
        long rev=0,temp=0;

        for(long i=num;num>0;i--){
            temp=num%10;
            num/=10;
            rev=(temp)+rev*10;
        }
        System.out.println("no is "+rev );
    }
}