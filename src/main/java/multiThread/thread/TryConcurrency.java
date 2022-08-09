package multiThread.thread;

import java.util.concurrent.TimeUnit;

public class TryConcurrency {
    public static void main(String[] args) {
        //通过匿名内部类的方式创建线程，并且重写其中的run方法
        new Thread() {         //①
            @Override
            public void run() {
                enjoyMusic();
            }
        }.start();           //②
        browseNews();
    }

    /**
     * Browse the latest news.
     */
    private static void browseNews() {
        for (; ; ) {
            System.out.println("Uh-huh, the good news.");
            sleep(1);
        }
    }

    /**
     * Listening and enjoy the music.
     */
    private static void enjoyMusic() {
        for (; ; ) {
            System.out.println("Uh-huh, the nice music.");
            sleep(1);
        }
    }

    /**
     * Simulate the wait and ignore exception.
     *
     * @param seconds
     */
    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
