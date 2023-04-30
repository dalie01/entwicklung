package dalieOCP.concurrency.locks.extrinsicLocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Train implements Runnable {

    private ReentrantLock lock = new ReentrantLock();

    public void board(String name) {
        if (lock.tryLock()) {
            System.out.println(name + ": boarded");
        } 
    }

    public void deboard(String name) {
        if (lock.isHeldByCurrentThread()) {
            System.out.println(name + ": deboarded");
            lock.unlock();
        }
    }

    @Override
    public void run() {
        board(Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some work being done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deboard(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Train bus = new Train();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(bus);
        executor.execute(bus);
        executor.shutdown();
    }
}