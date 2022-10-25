package cn.lq.stream;

import java.util.stream.Stream;

public class Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.map(str -> Integer.parseInt(str));
        stream.map(Integer::parseInt);

        /**
         * public static int parseInt(String s) throws NumberFormatException {
         *         return parseInt(s,10);
         * }
         */
    }
}
