package cn.lq.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList(new String[]{"aaa", "avbbb", "adsd", "nnn", "bbb"});
        strList.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        // ============================================
        List list = new ArrayList();
        Stream stream = list.stream();


        Map map = new HashMap();
        map.put("a", "b");
        Set set = map.keySet();
        stream = set.stream();

        Collection coll = map.values();
        stream = coll.stream();

        Set entrySet = map.entrySet();
        stream = entrySet.stream();

        Integer[] arr = new Integer[10];
        stream = Stream.of(arr);
    }
}
