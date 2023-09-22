package ar.net.edufmass.springdi.services;

//@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world from Constructor!";
    }
}
