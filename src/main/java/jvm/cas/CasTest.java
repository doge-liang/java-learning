package jvm.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasTest {

    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(10);

                            } catch (InterruptedException exception) {
                                exception.printStackTrace();
                            }
                            for (int j = 0; j < 100; j++) {
//                                synchronized (CasTest.class) {
                                    count.incrementAndGet();
//                                }
                            }
                        }
                    }
            ).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("count=" + count);
    }
}
