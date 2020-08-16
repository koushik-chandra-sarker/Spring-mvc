package com.springMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("name", "Koushik");

        List<String> friends = new ArrayList<String>();
        friends.add("Pronoy");
        friends.add("Rony");
        friends.add("Bishojit");

        model.addAttribute("f",friends);
        return "index";
    }
    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Koushik");
        modelAndView.setViewName("about");

        return modelAndView;
    }
    @RequestMapping("/help")
    public String help(Model model){
        model.addAttribute("name", "Hridoy");
        model.addAttribute("roll", 1001);

        List<Integer> Marks = new LinkedList<>();
        Marks.add(80);
        Marks.add(75);
        Marks.add(85);
        Marks.add(79);
        model.addAttribute("marks", Marks);

        return "help";
    }
    @RequestMapping("/services")
    public String services(){
        return "services";
    }
}
