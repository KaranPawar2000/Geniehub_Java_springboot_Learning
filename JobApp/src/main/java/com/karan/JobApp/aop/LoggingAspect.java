package com.karan.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


//return type  class name.method-name (args)
@Before("execution (* com.karan.JobApp.service.JobService.getJob(..)) || execution (* com.karan.JobApp.service.JobService.updateJob(..))")
public void logMethodCall(JoinPoint jp){

    LOGGER.info("Method Called " + jp.getSignature().getName());
}

    @After("execution (* com.karan.JobApp.service.JobService.getJob(..)) || execution (* com.karan.JobApp.service.JobService.updateJob(..))")
    public void logMethodEexcuted(JoinPoint jp){

        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution (* com.karan.JobApp.service.JobService.getJob(..)) || execution (* com.karan.JobApp.service.JobService.updateJob(..))")
    public void logMethodCrah(JoinPoint jp){

        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution (* com.karan.JobApp.service.JobService.getJob(..)) || execution (* com.karan.JobApp.service.JobService.updateJob(..))")
    public void logMethodExecutedSucess(JoinPoint jp){

        LOGGER.info("Method Executed Sucessfully " + jp.getSignature().getName());
    }

}
