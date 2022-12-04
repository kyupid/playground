package effective;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadSynchronizedTest {
    private static final AtomicInteger counter = new AtomicInteger(0);
    static Collection treeSet = new TreeSet();

    @Test
    void helloMultilThread() {
        Thread[] t = new Thread[10000];
        for (int i = 0; i < 1000; i++) {
            t[i] = new Thread(new WriterThread());
            t[i].start();
        }
    }

    class WriterThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                double v = Math.random() * 10;
                try {
                    treeSet.add(v);
                    treeSet.remove(v);
                } catch (NullPointerException e) {
                    System.out.println("v: " + v + ", Thread-name: " + Thread.currentThread().getName());
                    System.out.println(treeSet.size());
                }
            }
        }
    }

//    @Test
//    void testMultiThread() throws InterruptedException {
//        List<String> list = new ArrayList<>();
//        list.add("java");
//        list.add("js");
//        list.add("python");
//
//        SynchronizedCollection<String> sc = SynchronizedCollection.synchronizedCollection(list);
//
//        String a = "js";
//
//        sc.forEach((s) -> {
//            System.out.println("before" + s);
//        });
//
//        // thread 10개 생성
//        int nThread = 10;
//        ExecutorService executorService = Executors.newFixedThreadPool(nThread);
//
//        for (int i = 0; i < nThread; i++) {
//            executorService.submit(() -> {
//                int idx = counter.addAndGet(1);
//
//                System.out.println("idx : " + idx + " - removeIf " + sc.removeIf(p -> p.equals(a)));
//                return null;
//            });
//        }
//
//        executorService.awaitTermination(1, TimeUnit.SECONDS);
//
//        sc.forEach((s) -> {
//            System.out.println(s);
//        });
//    }
}
