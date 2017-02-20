package configuration;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** beans.BaseballGame.playGame(..))")
	public void playGame(){}
	
	@Before("playGame()")
	public void takeSeats(){
		System.out.println("Taking seats and putting hats on.");
	}
	
	@AfterReturning("playGame()")
	public void applause() {
		System.out.println("Hooray!!!");
	}
	
}
