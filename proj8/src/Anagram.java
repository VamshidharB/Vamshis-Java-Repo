import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String str1,str2;
        System.out.println("Enter the string 1");
        Scanner sc =new Scanner(System.in);
        str1= sc.nextLine();
        System.out.println("Enter the string 2");
        str2= sc.nextLine();
        int n=0;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()) n=10;
        else
            for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                n++;
            }}
        }
        if(n==str1.length())
        System.out.println("it is an anagram");
        else System.out.println("No, its not an anagram");
    }
}