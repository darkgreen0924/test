package cn.lq.lambda.demo1;

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

        //lambda表达式
        Factory factory2 = () -> new User();
        User user2 = (User) factory2.getObject();

        //lambda作为参数传递
        User user3 = getUserFormFactory(() -> new User(), "user");
        System.out.println(user3 == null);


    }

    public static User getUserFormFactory(Factory factory, String beanName) {
        Object obj = factory.getObject();
        if (obj != null && obj.getClass().getSimpleName().equalsIgnoreCase(beanName))
            return (User) obj;
        return null;
    }
}
