package ar.net.edufmass.springdi.services;

//@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from Setter!";
    }
}
