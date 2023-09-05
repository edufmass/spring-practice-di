package ar.net.edufmass.springdi.controllers;

import ar.net.edufmass.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /* In Constructor Injection Autowired is optional */
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
