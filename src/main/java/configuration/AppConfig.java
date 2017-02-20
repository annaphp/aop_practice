package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspects.Audience;
import beans.*;

@Configuration
@EnableAspectJAutoProxy  //enable aspects
public class AppConfig {
	
	@Bean
	public Game mgame(){
		//dependency injection through constructor
		Game game = new BaseballGame(home());
		//dependency injection through setter
		game.setAwayTeam(away());
		return game;
	}
	
	@Bean
	public Team home(){
		return new RedSox();
	}
	
	@Bean Team away(){
		return new Cubs();
	}

	@Bean
	//aspect bean
	public Audience audience(){
		return new Audience();
	}
	
	
	
	
	
	
	
	
	
	
	
}
