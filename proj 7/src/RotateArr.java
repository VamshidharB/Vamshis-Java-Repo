import java.util.*;

public class RotateArr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the position ");
        int p=sc.nextInt();

        int[]temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[p-1];
            p++;
            if(p==n+1){p=1;}
        }
        System.out.println("rotation of the array for the position " +p+" is :");
        for(int i=0;i<n;i++) System.out.print(temp[i]+" ");

    }
}
