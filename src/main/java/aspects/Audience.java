package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** beans.BaseballGame.playGame(..))")
	public void playGame(){}
	
	
	@Around("playGame()")
	public void watchGame(ProceedingJoinPoint jp){
		try{
			System.out.println("Taking seats and putting hats on.");
			jp.proceed();
			System.out.println("Hooray!!!");
		}catch (Throwable e){
			System.out.println("Yelling Boo!!");
		}
	}

	
}
