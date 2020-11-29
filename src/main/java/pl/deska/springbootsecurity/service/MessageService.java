package pl.deska.springbootsecurity.service;

import java.security.Principal;

public interface MessageService {

   String helloAdmin(Principal principal);
   String helloUser(Principal principal);
   String helloStranger(Principal principal);
    String goodBye();
}
