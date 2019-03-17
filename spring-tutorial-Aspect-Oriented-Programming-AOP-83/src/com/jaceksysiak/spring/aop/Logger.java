package com.jaceksysiak.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger  {
	
	@Pointcut("within(@Deprecated com.jaceksysiak.spring..*)")
	public void somePointcut(){
	}
	@Before("somePointcut()")
	public void somePointcutDemo(){
		System.out.println("********************** before demo **************************");
	}
	
}





























