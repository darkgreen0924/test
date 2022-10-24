package cn.lq.lambda;

import java.util.PriorityQueue;
import java.util.function.Consumer;

public class LambdaDemo {
    Runnable myRunnable = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    };
}

