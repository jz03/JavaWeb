package cn.jz.helloWorld.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 面向切面编程：面
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
@Aspect
public class Logging {

	@Pointcut("execution(* cn.jz.helloWorld.bean.*.*(..))")
	private void selectAll() {
	}

	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	@AfterReturning(pointcut = "selectAll()",returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
