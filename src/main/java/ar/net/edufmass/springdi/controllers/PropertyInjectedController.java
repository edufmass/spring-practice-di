package ar.net.edufmass.springdi.controllers;

import ar.net.edufmass.springdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
