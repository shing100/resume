package com.kingname.resume.module.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/")
    public String homeView(Model model) {
        return "index";
    }

    @GetMapping("/post-format-standard")
    public String postFormatStandard(Model model) {
        return "post-format-standard";
    }

    @GetMapping("/post-list")
    public String postList(Model model) {
        return "post-list";
    }

    @GetMapping("post-details")
    public String postDetails(Model model) {
        return "post-details";
    }
}
