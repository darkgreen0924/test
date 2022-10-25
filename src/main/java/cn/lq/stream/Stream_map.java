package cn.lq.stream;

import java.util.stream.Stream;

public class Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
//        stream.map(str -> Integer.parseInt(str));
        //count return long
        System.out.println(stream.map(Integer::parseInt).count());
        /**
         * public static int parseInt(String s) throws NumberFormatException {
         *         return parseInt(s,10);
         * }
         */
    }
}
