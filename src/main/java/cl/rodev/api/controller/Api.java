package cl.rodev.api.controller;


import cl.rodev.api.model.Person;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class Api {

    @PostMapping(path = "/hello", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String hello( String name){
        return "Hello "+name;
    }

    @PostMapping(path = "/hello2", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String hello( @RequestBody Person person){

            return "Hello "+person.getName();
        

    }


}
