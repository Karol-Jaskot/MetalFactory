package pl.project.metalfactory.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping(value = {"", "/"})
    public String index() {
        return "index";
    }

}
