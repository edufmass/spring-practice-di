package ar.net.edufmass.springdi.services;

import org.springframework.stereotype.Service;

//@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from Setter!";
    }
}
