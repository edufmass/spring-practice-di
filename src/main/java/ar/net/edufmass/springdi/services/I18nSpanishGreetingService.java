package ar.net.edufmass.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES", "default"}) removed into config
//@Service("i18nService") removed into config
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo en Español !!!";
    }
}
