package cn.lq.lambda.demo1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        //接口实现类
        Factory factory = new SubClass();
        User user = (User) factory.getObject();

        //匿名内部类
        User user1 = (User) new Factory() {
            @Override
            public Object getObject() {
                return new User();
            }
        }.getObject();

        Runnable runnable = () -> {
            System.out.println("cc");
        };
        runnable = () -> System.out.println("cc");

        Factory factory2 = () -> {
            System.out.println("cc");
            return new User();
        };
        factory2 = () -> new User();
        User user2 = (User) factory2.getObject();

        //lambda作为参数传递
        User user3 = getUserFormFactory(() -> new User(), "user");
        System.out.println(user3 == null);


        //------------------------------------------

        //lambda表达式 （parameter）->{statement};
        //可选花括号{}：当只有一行语句时可以不写{}
        //可选return：当只有一行且有返回时可以不写返回
        //可选():当只有一个参数时可以省略括号，同时省略类型，没参数和大于1个都不能
        //可选类型声明：不需要声明，编译器可以推断
        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;

        /*
        常见的函数式接口
        Runnable/Callable
        Supplier/Consumer
        Comparator
        Predicate
        Function
         */


        Supplier<User> supplier = User::new;
        System.out.println(supplier.get());

        consumer((s) -> System.out.println(s));

        consumerAndThen(s -> System.out.println(s.toLowerCase()), s -> System.out.println(s.toUpperCase()));


        System.out.println(predicateOr(s -> s.contains("a"), s -> s.contains("p")));

        List<String> list = Arrays.asList(new String[]{"d", "a", "r", "k"});
        list.stream().forEach(System.out::println);


        System.out.println(getTTime(() -> System.currentTimeMillis()));
        System.out.println(getTTime(System::currentTimeMillis));

        supplier = User::new;
        supplier.get();
    }

    public static Long getTTime(Calculate calculate) {
        return calculate.getTime();
    }

    public static User getUserFormFactory(Factory factory, String beanName) {
        Object obj = factory.getObject();
        if (obj != null && obj.getClass().getSimpleName().equalsIgnoreCase(beanName))
            return (User) obj;
        return null;
    }


    public static void consumer(Consumer<String> function) {
        function.accept("hello");
    }

    public static void consumerAndThen(Consumer<String> first, Consumer<String> second) {
        Consumer<String> stringConsumer = first.andThen(second);
        stringConsumer.accept("hello");
    }

    public static boolean predicateOr(Predicate<String> p1, Predicate<String> p2) {
        return p1.or(p2).test("apple");
    }


}