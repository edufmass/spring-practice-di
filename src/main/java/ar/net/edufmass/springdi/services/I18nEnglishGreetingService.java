package ar.net.edufmass.springdi.services;

import ar.net.edufmass.springdi.repositories.EnglishGreetingRepository;

//@Profile("EN") removed into config
//@Service("i18nService") removed into config and used as method name
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello world in English !!!";
    }
}
