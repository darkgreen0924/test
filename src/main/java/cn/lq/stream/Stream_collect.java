package cn.lq.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_collect {
    //需求返回三个字的人名到集合中
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("青酱");
        list.add("离京");
        list.add("弑青");
        list.add("lzd");
        list.add("cj");
        Stream<String> stream = list.stream();
//        stream.filter(Stream_collect::isSizeThree).collect(Collectors.toList());

        //聚合操作

//        Optional<String> max = stream.collect(Collectors.maxBy(String::compareTo));
//        System.out.println(max);
        String str = stream.collect(Collectors.joining(",", "^-^", "^~^"));
        System.out.println(str);
    }

    public static boolean isSizeThree(String s) {
        return s.length() == 3;
    }
}
