package Practice_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigaration.class);
		ShoppingCart cart = context.getBean(ShoppingCart.class);
		cart.checkout("Method Declared");
		AuthenticationAspect as = context.getBean(AuthenticationAspect.class);
		as.authentication();
	}
}
	