package ar.net.edufmass.springdi.config;

import ar.net.edufmass.springdi.services.ConstructorGreetingService;
import ar.net.edufmass.springdi.services.PropertyGreetingService;
import ar.net.edufmass.springdi.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    // method name is the bean name in context
    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
    
}
