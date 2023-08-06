package ar.net.edufmass.springdi;

import ar.net.edufmass.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(greetings);
	}

}
