package com.kingname.resume.module.resume;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ResumeController {

    private final List<String> THEME_LIST = Arrays.asList("BurntSienna", "LightSlateBlue", "Emerald", "Orange", "NavyBlue", "Wedgewood");

    private final ResumeService resumeService;

    // 테마
    @GetMapping("/resume/theme/{path}/{themeName}")
    public String themeView(@PathVariable String path, @PathVariable String themeName, Model model) {
        if (THEME_LIST.contains(themeName)) {
            return "theme/" + path + "/" + themeName + "/index";
        }
        return "redirect:/";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/resume")
    public String themeResumeView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/resume";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/portfolio")
    public String themePortfolioView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/portfolio";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/portfolio-project-2")
    public String themePortfolioProject2View(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/portfolio-project-2";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/portfolio-project-1")
    public String themePortfolioProjectView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/portfolio-project-1";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/blog")
    public String themeBlogView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/blog";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/blog-post-1")
    public String themeBlogPostView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/blog-post-1";
    }

    @GetMapping("/resume/theme/{path}/{themeName}/contact")
    public String themeContactView(@PathVariable String path, @PathVariable String themeName, Model model) {
        return "theme/" + path + "/" + themeName + "/contact";
    }

}
