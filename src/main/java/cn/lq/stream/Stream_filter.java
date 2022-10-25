package cn.lq.stream;

import java.util.stream.Stream;

public class Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("dark", "faker", "jacklove", "lookat", "mark");
        stream.filter(s -> s.endsWith("k")).forEach(System.out::println);
    }
}
