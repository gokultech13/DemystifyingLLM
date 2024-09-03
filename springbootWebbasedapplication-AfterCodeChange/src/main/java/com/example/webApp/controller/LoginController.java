package com.example.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String authenticateUser(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   Model model) {

        // Hardcoded credentials for demo purposes
        String hardcodedUsername = "user";
        String hardcodedPassword = "password";

        if (username.equals(hardcodedUsername) && password.equals(hardcodedPassword)) {
            // Successful authentication
            return "/applicationForm"; // Redirect to a application form page or dashboard
        } else {
            // Authentication failed
            model.addAttribute("error", "Invalid username or password.");
            return "login"; // Stay on the login page and show the error message
        }
    }

    @GetMapping("/signup")
    public String showSignupForm() {
        // Return the signup form view
        return "signup";
    }
    
    
}