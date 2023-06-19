import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cat", "dog", "elephant", "frog"};

        // Sort the array based on the given criteria
        Arrays.sort(strings, new StringComparator());

        // Print the sorted array
        for (String string : strings) {
            System.out.println(string);
        }
    }

    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            int lengthComparison = Integer.compare(str1.length(), str2.length());
            if (lengthComparison != 0) {
                return lengthComparison; // Sort by length in ascending order
            } else {
                char lastChar1 = str1.charAt(str1.length() - 1);
                char lastChar2 = str2.charAt(str2.length() - 1);
                return Character.compare(lastChar2, lastChar1); // Sort by last character in descending order
            }
        }
    }
}
