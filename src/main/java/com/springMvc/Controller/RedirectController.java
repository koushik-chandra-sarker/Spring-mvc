package com.springMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RedirectController {
    
    @RequestMapping("/one")
    public String one(){
        System.out.println("This is handler One");
        return "redirect:/two";
    }

    @RequestMapping("/two")
    public String two(){
        System.out.println("This is handler two");
        return "";
    }
    @RequestMapping("/three")
    public RedirectView three(){
        System.out.println("This is handler three");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("one");
        return redirectView;
    }

}
