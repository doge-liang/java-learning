package multiThread.thread;

public class ThreadSleep {
    public static void main(String[] args) {
        new Thread(() -> {
            long startTIme = System.currentTimeMillis();
                sleep(2_000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms", (endTime - startTIme)));

        }).start();

        long startTime = System.currentTimeMillis();
        sleep(3_000L);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Main thread total spedn %d ms", (endTime - startTime)));

    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
