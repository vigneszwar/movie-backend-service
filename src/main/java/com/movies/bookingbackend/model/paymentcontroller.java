package com.movies.bookingbackend.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class paymentcontroller {
    @GetMapping("/")
    public String geet() {
        return "payment";
    }

    @PostMapping("/register")
    public String payment() {
        return "paid";
    }
    @PostMapping("/home")
    public String gg(){
        return "joke";
    }

    // @PostMapping("/register")
    // public String userPayment(@ModelAttribute User user) {
    // System.out.println(user.toString());
    // return "paid";
    // }

}