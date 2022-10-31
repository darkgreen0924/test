package cn.lq.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component()
public class Person implements InitializingBean, DisposableBean {
    private String name;
    private String age;
    @Autowired
    private Car car;

    @Autowired
    private Bike bike;

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

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


    @Override
    public void afterPropertiesSet() throws Exception {
        //do something
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
