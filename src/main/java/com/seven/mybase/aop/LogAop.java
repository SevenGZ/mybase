package com.seven.mybase.aop;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAop {

    @Pointcut("execution(* com.seven.mybase.service..*(..)) || execution(* com.seven.mybase.controller..*(..))")
    public void log() {

    }


    @Around("log()")
    public Object doAround(ProceedingJoinPoint pjp) {
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().getName();

        Object[] args = pjp.getArgs();
        long startTime = System.currentTimeMillis();

        try {
            String argsStr = args == null ? "" : JSONUtil.toJsonStr(args);
            log.info(startTime + ",开始调用>>>" + className + "." + methodName + ",入参:" + argsStr);
        } catch (Throwable e) {
            log.error("打印参数出错", e);
        }

        long endTime = System.currentTimeMillis();

        Object res = null;
        try {
            res = pjp.proceed();
            //TODO 判断参数大小
            String argsStr = res == null ? "" : JSONUtil.toJsonStr(res);
            log.info(endTime + ",调用结束>>>" + className + "." + methodName + ",结果:" + argsStr + ",耗时:" + (endTime - startTime));
        } catch (Throwable e) {
            log.error("打印参数出错", e);
        }
        return res;
    }
}
