public class StringToIntegerConverter {
    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertToInteger(input);
                System.out.println("Input: " + input + " | Output: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + " | Exception: " + e.getMessage());
            }
        }
    }

    public static int convertToInteger(String string) throws NumberFormatException {
        return Integer.parseInt(string);
    }
}
