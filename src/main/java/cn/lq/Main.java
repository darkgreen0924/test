package cn.lq;

import cn.lq.spring.bean.Car;
import cn.lq.spring.bean.Person;
import cn.lq.spring.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
//        xml配置
//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
//        注解配置
//        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person bean = ioc.getBean(Person.class);
//        System.out.println(bean.getName());


//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("'hello world'.concat('!')");
//        String str = (String) expression.getValue();
//        System.out.println(str);

        //循环依赖
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
        Person bean = ioc.getBean(Person.class);
        System.out.println(bean.getName());
        Person p = new Person();
        Car car = new Car();

    }
}