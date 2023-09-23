package ar.net.edufmass.springdi.config;

import ar.com.edufmass.pets.PetService;
import ar.com.edufmass.pets.PetServiceFactory;
import ar.net.edufmass.springdi.datasource.FakeDataSource;
import ar.net.edufmass.springdi.repositories.EnglishGreetingRepository;
import ar.net.edufmass.springdi.repositories.EnglishGreetingRepositoryImpl;
import ar.net.edufmass.springdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//@PropertySource("classpath:datasource.properties") // needed when config is not loaded from application.properties
@ImportResource("classpath:springdi-config.xml") //could be in application
@Configuration
public class GreetingServiceConfig {

    // method name is the bean name in context

    @Bean
    FakeDataSource fakeDataSource(@Value("${arnet.username}") String username,
                                  @Value("${arnet.password}") String password,
                                  @Value("${arnet.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

    //@Bean is picked up from springdi-config.xml
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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService") // bean name because we can't repeat method name
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    // PETS package
    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }
}
