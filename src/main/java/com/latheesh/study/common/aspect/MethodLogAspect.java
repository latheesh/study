package com.latheesh.study.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodLogAspect {
    @Before("execution(* com.latheesh..service.*.*(..))")
    public void methodEntry(JoinPoint joinPoint) {
        Logger logger = LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringType());
        Signature signature = joinPoint.getSignature();
        logger.info("Entering method {} with parameters {}", joinPoint.toShortString(), joinPoint.getArgs());
    }

    @After("execution(* com.latheesh..service.*.*(..))")
    public void methodExit(JoinPoint joinPoint) {
        Logger logger = LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringType());
        logger.info("Exiting method {}", joinPoint.getSignature().getName());
    }
}
