import java.util.Arrays;

public class StringCapitalizationAndSorting {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cat", "dog"};

        // Capitalize the first letter of each string
        for (int i = 0; i < strings.length; i++) {
            String capitalizedString = capitalizeFirstLetter(strings[i]);
            strings[i] = capitalizedString;
        }

        // Sort the strings in alphabetical order
        Arrays.sort(strings);

        // Print the strings
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char firstChar = Character.toUpperCase(str.charAt(0));
        return firstChar + str.substring(1);
    }
}
