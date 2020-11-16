package cl.rodev.api.controller;

import cl.rodev.api.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/control")
public class Control {


    @GetMapping("/persons")
    public String persons(Model model){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Mikel",20));
        list.add(new Person("Mike",40));
        list.add(new Person("Walter",34));
        list.add(new Person("Peter",20));
        model.addAttribute("persons",list);
        return "example2";
    }

}
