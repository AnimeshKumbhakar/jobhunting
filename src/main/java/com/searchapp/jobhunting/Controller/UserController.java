package com.searchapp.jobhunting.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping()
public class UserController {

    @GetMapping("message")
    public ResponseEntity<?> printMessage(){
        String hello = "hello this message is printing";
        return new ResponseEntity<>(hello, HttpStatus.OK);
    }

    @GetMapping("register")
    public ModelAndView getRegisterPage() {
        ModelAndView modelAndView = new ModelAndView("register/index"); // "page1" is the name of your HTML file (without extension)
        // Add any model attributes if needed
        return modelAndView;
    }

    @GetMapping("login")
    public ModelAndView getindexPage() {
        ModelAndView modelAndView = new ModelAndView("login/index"); // "page1" is the name of your HTML file (without extension)
        // Add any model attributes if needed
        return modelAndView;
    }




}
