package com.kingname.resume.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    public String homeView(Model model) {
        return "index";
    }

}
