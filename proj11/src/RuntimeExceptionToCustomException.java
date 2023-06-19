class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class RuntimeExceptionToCustomException {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            try {
                throw new CustomException("Divide by zero error occurred");
            } catch (CustomException ex) {
                System.out.println("Caught Custom Exception: " + ex.getMessage());
            }
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
