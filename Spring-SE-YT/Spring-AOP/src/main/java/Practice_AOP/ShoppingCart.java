package Practice_AOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkout(String status) {
		/*Login
		 * Authentication & Authorization
		 * Sanitize the Data
		 */
		System.out.println("Checkout Method from ShoppingCart called : ");
	}
}
