package ar.net.edufmass.springdi.controllers;

import ar.net.edufmass.springdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
