package cn.lq.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class Person implements InitializingBean {
    private String name;
    private String age;
    @Autowired
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() + "：被初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + "：被销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //do something
    }

}
