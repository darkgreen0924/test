package cn.lq.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Stream_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "5", "6", "7", "8", "9");
//        Optional<Integer> max = stream.skip(3).map(Integer::parseInt).max(Integer::compare);
//        System.out.println(max);
//        Integer integer = max.get();
//        System.out.println(integer);

        String[] strings = stream.toArray(String[]::new);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}
