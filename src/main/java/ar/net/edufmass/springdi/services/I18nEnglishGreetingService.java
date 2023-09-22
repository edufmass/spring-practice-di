package ar.net.edufmass.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN") removed into config
//@Service("i18nService") removed into config and used as method name
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world in English !!!";
    }
}
