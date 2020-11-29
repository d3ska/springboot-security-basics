package pl.deska.springbootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class MessageServiceImpl implements  MessageService{

    private Counter counter;

    @Autowired
    public MessageServiceImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public String helloAdmin(Principal principal) {
        String name = principal.getName();
        return "Hello admin " + name + ", you are authenticented for "  + counter.geVisitNumb(name) + " time";
    }

    @Override
    public String helloUser(Principal principal) {
        String name = principal.getName();
        return "Hello user " + name + ", you are authenticented for "  + counter.geVisitNumb(name) + " time";
    }

    @Override
    public String helloStranger(Principal principal) {
        if(principal != null){
            return "Hello " + principal.getName();
        }else{
            return "Hello stranger";
        }
    }

    @Override
    public String goodBye() {
       return "Goodbye!";
    }


}
