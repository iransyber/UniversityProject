package br.com.systemdevelopment.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectP {
		@Pointcut("execution(* br.com.systemsdevelopment.daos.*.*(..))")
		public void defineEntryPoint(){
			//***///
		}
		
		@Before("defineEntryPoint()")
		public void aa(JoinPoint joinPoint){
			System.out.println("aspect before");
		}
		
		@After("defineEntryPoint()")
		public void bbb(JoinPoint joinPoint){
			System.out.println("aspect after");
		}
}
