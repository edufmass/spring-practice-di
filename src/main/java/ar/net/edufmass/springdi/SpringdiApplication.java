package ar.net.edufmass.springdi;

import ar.net.edufmass.springdi.controllers.ConstructorInjectedController;
import ar.net.edufmass.springdi.controllers.MyController;
import ar.net.edufmass.springdi.controllers.PropertyInjectedController;
import ar.net.edufmass.springdi.controllers.SetterInjectedController;
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

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
