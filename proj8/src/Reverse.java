import java.util.Scanner;

public class Reverse {
    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println("enter the string: ");
        Scanner sc=new Scanner(System.in);
        String inputSentence= sc.nextLine();
        String outputSentence = reverseWordsInSentence(inputSentence);
        System.out.println(outputSentence);

    }
}
