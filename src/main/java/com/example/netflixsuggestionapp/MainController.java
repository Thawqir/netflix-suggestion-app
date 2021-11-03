package com.example.netflixsuggestionapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    NetflixRepo netflixRepo;

    @GetMapping("/title")
    public String showSignUpForm(Title title) {
        return "adduser";
    }

    @GetMapping("/index")
    public String homepage(Model model){
        model.addAttribute("titles",netflixRepo.findAll());
        return "index";
    }

    @PostMapping("/addtitle")
        public String addTitle(Title title){
        netflixRepo.save(title);
            return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteTitle(@PathVariable("id")long id){
        Title title = netflixRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        netflixRepo.delete(title);
        return "redirect:/index";
    }

}
