import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        java.util.concurrent.ExecutorService pool = java.util.concurrent.Executors.newCachedThreadPool();
        for (int i = 0; i < num; i++) {
            pool.execute(new singleThread());
        }
        pool.shutdown();
    }
}
