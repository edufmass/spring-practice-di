package ar.net.edufmass.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary removed into config
//@Service removed into config
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from PRIMARY Bean!";
    }
}
