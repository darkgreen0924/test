package cn.lq.stream;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class Stream_Parallel {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test1();//342
        test2();
        test3();
    }

    public static void test1() {
        long s = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < 999_9999_9999L; i++) {
            sum += i;
        }
        System.out.println(sum);
        long e = System.currentTimeMillis();
        System.out.println("结果是" + sum + "：" + (e - s));

    }

    public static void test2() {
        long s = System.currentTimeMillis();
        long sum = LongStream.range(0L, 999_9999_9999L).parallel().reduce(0, Long::sum);
        long e = System.currentTimeMillis();
        System.out.println("结果是" + sum + "：" + (e - s));
    }

    public static void test3() throws ExecutionException, InterruptedException {
        long s = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo task = new ForkJoinDemo(0, 999_9999_9999L);
        forkJoinPool.submit(task);
        Long sum = task.get();
        long e = System.currentTimeMillis();
        System.out.println("结果是" + sum + "：" + (e - s));
    }
}
