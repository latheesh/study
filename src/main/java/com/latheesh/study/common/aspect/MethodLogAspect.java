package com.latheesh.study.common.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodLogAspect {
    @Before("execution(* com.latheesh..service.*.*(..))")
    public void methodEntry(JoinPoint joinPoint) {
        Logger logger = LogManager.getLogger(joinPoint.getSignature().getDeclaringType());
        Signature signature = joinPoint.getSignature();
        logger.info("Entering method {} with parameters {}", joinPoint.toShortString(), joinPoint.getArgs());
    }

    @Around("execution(* com.latheesh..service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        Logger logger = LogManager.getLogger(joinPoint.getSignature().getDeclaringType());
        Object result = joinPoint.proceed();
        logger.info("Result of method {} execution is {}", joinPoint.getSignature().getName(), result);
        return result;
    }

    @AfterThrowing(pointcut = "execution(* com.latheesh..service.*.*(..))", throwing = "ex")
    public void logAfterThrowingException(JoinPoint joinPoint, Throwable ex) {
        Logger logger = LogManager.getLogger(joinPoint.getSignature().getDeclaringType());
        logger.error("Error occured in  method {}. Error Message", joinPoint.getSignature().getName(), ex);
    }

    @After("execution(* com.latheesh..service.*.*(..))")
    public void methodExit(JoinPoint joinPoint) {
        Logger logger = LogManager.getLogger(joinPoint.getSignature().getDeclaringType());
        logger.info("Exiting method {}", joinPoint.getSignature().getName());
    }
}
