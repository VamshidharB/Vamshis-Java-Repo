public class AverageOfOddSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = calculateAverageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    private static double calculateAverageOfOddSquares(int[] numbers) {
        int sumOfSquares = 0;
        int countOfOddNumbers = 0;

        for (int number : numbers) {
            if (number % 2 != 0) { // Check if the number is odd
                int square = number * number;
                sumOfSquares += square;
                countOfOddNumbers++;
            }
        }

        if (countOfOddNumbers == 0) {
            return 0; // Return 0 if there are no odd numbers in the array
        }

        return (double) sumOfSquares / countOfOddNumbers;
    }
}
