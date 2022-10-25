package cn.lq.date;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.http.HttpClient;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class InstantDemo01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());
    }
}
