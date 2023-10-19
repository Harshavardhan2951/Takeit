package Practice_AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Login {
	//execution("anytype" "anypackage"."anyclass".checkout()
	@Before("execution(* Practice_AOP.ShoppingCart.checkout(..))")
	public void beforelogger() {
		System.out.println("Before Logger");
	}
	@After("execution(* *.*.checkout(..))")
	public void afterlogger() {
		System.out.println("After Logger");
	}
}
