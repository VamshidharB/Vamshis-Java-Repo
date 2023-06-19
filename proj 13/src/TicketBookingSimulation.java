import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBookingSystem {
    private int availableTickets;
    private Lock lock;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
        this.lock = new ReentrantLock();
    }

    public void bookTicket(int numTickets) {
        lock.lock(); // Acquire the lock to ensure exclusive access
        try {
            if (availableTickets >= numTickets) {
                System.out.println(Thread.currentThread().getName() + " booked " + numTickets + " ticket(s).");
                availableTickets -= numTickets;
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to book tickets. Available tickets: " + availableTickets);
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numTickets;

    public BookingThread(TicketBookingSystem bookingSystem, int numTickets) {
        this.bookingSystem = bookingSystem;
        this.numTickets = numTickets;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(numTickets);
    }
}

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

        Thread thread1 = new BookingThread(bookingSystem, 3);
        Thread thread2 = new BookingThread(bookingSystem, 4);
        Thread thread3 = new BookingThread(bookingSystem, 5);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
