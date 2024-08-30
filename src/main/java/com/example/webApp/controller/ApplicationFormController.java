package com.example.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationFormController {

    @GetMapping("/apply")
    public String showApplicationForm() {
        return "applicationForm";
    }

    @PostMapping("/apply")
    public String submitApplication(@RequestParam("name") String name,
                                   @RequestParam("email") String email,
                                   @RequestParam("phone") String phone,
                                   @RequestParam("message") String message,
                                   Model model) {

        // Process the application form data
        System.out.println("Application submitted:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Message: " + message);

        // Add a success message to the model
        model.addAttribute("success", "Application submitted successfully!");

        return "applicationForm"; // Return to the same page with a success message
    }
}