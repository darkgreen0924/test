package cn.lq.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    //         execution(* transfer(..))
    @Pointcut("execution(* cn.lq.spring.bean.*.*(..))")
    public void atComponentLevel(){}
    @Around("MyAspect.atComponentLevel()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around 前");
        //打印签名
        System.out.println(jp.getSignature());
        //执行方法
        jp.proceed();
        System.out.println("around 后");
    }

}
