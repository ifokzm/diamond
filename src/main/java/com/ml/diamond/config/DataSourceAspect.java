package com.ml.diamond.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Order(1)   //设置AOP执行顺序(需要在事务之前，否则事务只发生在默认库中)
@Component
@Slf4j
public class DataSourceAspect {

    //切点
    @Pointcut("execution(* com.ml.diamond.*.service..*.*(..)))")
    public void aspect() {
    }

    @Before("@annotation(com.ml.diamond.config.DS)")
//    @Before("aspect()")
    private void before(JoinPoint point) {
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?> classz = target.getClass();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
        try {
            Method m = classz.getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DS.class)) {
                DS data = m.getAnnotation(DS.class);

                // TODO 根据用户会话中指定的城市设置数据源名称

                DataSourceContextHolder.putDataSource(data.value().getName());
                log.info("===============上下文赋值完成:{}", data.value().getName());
            } else {
                DataSourceContextHolder.putDataSource(DataSourceType.Master.getName());
                log.info("默认数据库: {}", DataSourceType.Master.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterReturning("aspect()")
    public void after(JoinPoint point) {
        DataSourceContextHolder.clearDataSource();
    }

}
