package ar.net.edufmass.springdi.services;

//@Primary removed into config
//@Service removed into config
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from PRIMARY Bean!";
    }
}
