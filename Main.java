public class Main {
    public static void main(String[] args) {
        // Start one thread that runs your singleThread task
        new Thread(new singleThread()).start();
    }
}
