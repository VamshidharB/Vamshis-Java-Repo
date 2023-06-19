import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SumCalculator implements Runnable {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private int partialSum;

    public SumCalculator(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;

    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];

        }
    }
}

public class MultithreadedSumCalculation {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        SumCalculator[] calculators = new SumCalculator[5];
        int startIndex = 0;
        int endIndex = 20;

        for (int i = 0; i < 5; i++) {
            calculators[i] = new SumCalculator(array, startIndex, endIndex);
            startIndex = endIndex;
            endIndex += 20;
            executor.execute(calculators[i]);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        int finalSum = 0;
        for (SumCalculator calculator : calculators) {
            finalSum += calculator.getPartialSum();
        }

        System.out.println("Sum of array elements: " + finalSum);
    }
}
