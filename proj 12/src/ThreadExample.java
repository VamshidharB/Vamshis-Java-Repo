class NumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds between each number
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberRunnable());
        numberThread.start();
        System.out.println("Main thread continues its execution.");
    }
}
