import java.util.Scanner;

public class RevArr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }


        int[]temp=new int[5];
        int j=4;
        for(int i=0;i<5;i++){
            temp[j]=arr[i];
            j--;
        }
        System.out.println("reverse of the array is: ");
        for(int i=0;i<5;i++) System.out.print(temp[i]+" ");

    }
}
