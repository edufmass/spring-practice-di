package ar.net.edufmass.springdi.services;

//@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from Property!";
    }
}
