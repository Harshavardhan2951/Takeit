package Practice_AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages  = "Practice_AOP")
@EnableAspectJAutoProxy
public class BeanConfigaration {
	
}
