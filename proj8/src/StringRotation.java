import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println("enter the string 1: ");
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("enter the string 2: ");
        String str2 = sc.nextLine();
        boolean isRotation = isRotation(str1, str2);
        System.out.println(isRotation);
    }
}