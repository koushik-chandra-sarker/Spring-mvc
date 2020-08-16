package com.springMvc.Controller;

import com.springMvc.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SignUpController {

    @RequestMapping("/signup")
    public String contact() {

        return "signup";
    }

    /*@RequestMapping(path ="/signupProcess", method = RequestMethod.POST)
    public String formControl(HttpServletRequest request){

        String email = request.getParameter("email");
        System.out.println(email);
        return "";
    }*/

    //OR
    /*@RequestMapping(path = "/signupProcess", method = RequestMethod.POST)
    public String formControl(
            @RequestParam("email") String userEmail,
            @RequestParam("username") String userName,
            @RequestParam("password") String userPassword,
            Model model) {

        model.addAttribute("username",userName);
        model.addAttribute("email",userEmail);
        model.addAttribute("password",userPassword);

        return "success";
    }*/

    //or

    /*@RequestMapping(path = "/signupProcess", method = RequestMethod.POST)
    public String formControl(
            @RequestParam("email") String userEmail,
            @RequestParam("username") String userName,
            @RequestParam("password") String userPassword,
            Model model) {

        User user = new User(userName,userEmail,userPassword);
        model.addAttribute("user",user);


        return "success";
    }*/

    //or
    //User's fields must be same as input's names
    @RequestMapping(path = "/signupProcess", method = RequestMethod.POST)
    public String formControl(@ModelAttribute User user, Model model) {
        return "success";
    }

}
