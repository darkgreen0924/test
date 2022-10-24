package cn.lq.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ComponentScan(basePackages = {"cn.lq.spring"})
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

}
