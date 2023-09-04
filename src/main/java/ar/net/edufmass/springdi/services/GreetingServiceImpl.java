package ar.net.edufmass.springdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world!";
    }
}
