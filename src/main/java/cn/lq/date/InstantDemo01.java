package cn.lq.date;



import java.time.Instant;

public class InstantDemo01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());
    }
}
