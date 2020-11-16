package cl.rodev.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class Controlador {

    @GetMapping("/page1")
    public String page1(Model model){
        model.addAttribute("name","Nikel");
        return "example";
    }
}
