package edu.zut.cs.express.journal.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect@Component class UJournlaAspect {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    //Service层切点    
    @Pointcut("@annotation(UJournalAnnotation)")
    @Around("UJournlaAspect()")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();
        Object[] args = joinPoint.getArgs();
        if(logger.isDebugEnabled()){
            logger.debug("doAround_begin: target: {} ,args: {}" ,target ,args);
        }

	//TODO do something before proceed

        //do target.method
        try {
        } catch (Throwable e) {
            logger.error("doAround_proceed error:" + e.getMessage() , e);
            throw e;
        }
 

	//TODO do something after proceed

        if(logger.isDebugEnabled()){
            logger.debug("doAround_end: target: {} ,args: {}" ,target ,args);
        }
    }
}    