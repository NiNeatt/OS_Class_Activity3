import java.util.concurrent.*;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        ForkJoinTask<?> task = forkJoinPool.submit(() -> {
            for (int i = 1; i <= 6; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // short pause so you can see the sequence
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        task.join(); // wait until the task finishes
        forkJoinPool.shutdown();
    }
}
