package Practice_AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	/*Create a Point Cuts*/
	@Pointcut("within(Practice_AOP..*)")
	public void authenticatingPointCut() {
		
	}
	@Pointcut("within(Practice_AOP.ShoppingCart.*)")
	public void authorizationPointCut() {
		
	}
	//We need to call this PointCuts
	@Before("authenticatingPointCut() && authorizationPointCut() ")
	public void authentication() {
		System.out.println("Authenticating the request");
	}
	
}
