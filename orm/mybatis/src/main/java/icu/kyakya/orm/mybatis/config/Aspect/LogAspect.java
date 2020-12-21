package icu.kyakya.orm.mybatis.config.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Slf4j
@Configuration
public class LogAspect {

    @Around("execution(* icu.kyakya.orm.mybatis.service..*(..))")
    public Object entryAndExit(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String[] tmp = declaringTypeName.split("\\.");
        String basename = tmp[tmp.length - 1];

        log.info("[{}.{}] Start", basename, pjp.getSignature().getName());
        Object result = pjp.proceed();
        log.info("[{}.{}] Finish", basename, pjp.getSignature().getName());

        return result;
    }


}
