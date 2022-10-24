package cn.lq.lambda;

public class LambdaDemo {
    Runnable myRunnable = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    };
}
