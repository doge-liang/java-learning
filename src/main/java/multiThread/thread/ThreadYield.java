package multiThread.thread;

import java.util.stream.IntStream;

public class ThreadYield {
    public static void main(String[] args) {
        IntStream.range(0, 2).mapToObj(ThreadYield::create)
                .forEach(Thread::start);
    }

    private static Thread create(int index) {
        return new Thread(() ->
        {
            //①注释部分
//            if (index == 1)
//                Thread.yield();
            System.out.println(index);
            System.out.println("Thread Id: " + Thread.currentThread().getId());
        });
    }
}