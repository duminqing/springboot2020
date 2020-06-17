package com.example.demoaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     * 通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * com.example.demoaop.MyService.test1*(..)))")
    public void PointCut() {

    }

    @Before("PointCut()")
    public void doBeforeGame() {
        System.out.println("Before！");
    }

    @After("PointCut()")
    public void doAfterGame() {
        System.out.println("After！");
    }

    @AfterReturning("PointCut()")
    public void doAfterReturningGame() {
        System.out.println("AfterReturning！");
    }

    @Around("PointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around1 !");
        Object o = pjp.proceed();

        System.out.println("Around2 !");

        return o;
    }

    @AfterThrowing("PointCut()")
    public void doAfterThrowingGame() {
        System.out.println("AfterThrowing！");
    }
}
