package ar.net.edufmass.springdi.services;

//@Profile({"ES", "default"}) removed into config
//@Service("i18nService") removed into config
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo en Español !!!";
    }
}
