public class StringsWithVowels {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "open", "ai", "java"};

        for (String str : strings) {
            int vowelCount = countVowels(str);
            if (vowelCount > 0) {
                System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
            }
        }
    }

    private static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
