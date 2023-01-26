package com.example.thymeleafformdemo.controllers;

import com.example.thymeleafformdemo.models.RegisterModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

        @GetMapping("/register")
        public String registerForm(Model model) {

           model.addAttribute("myRegister", new RegisterModel());
            return "create_register";
        }

        @PostMapping("/save-register")
        public String saveRegisterSubmission(Model model, RegisterModel myRegister) {
            System.out.println(">>>>>> IN saveRegisterSubmission");
            System.out.println(">>>>>> fname="+myRegister.getFirstName());
            System.out.println(">>>>>> lname="+myRegister.getLastName());
            System.out.println(">>>>>> pass ="+myRegister.getPassword());
            System.out.println(">>>>>> address ="+myRegister.getAddress());
            System.out.println(">>>>>> email ="+myRegister.getEmail());
            System.out.println(">>>>>> phoneNumber ="+myRegister.getPhoneNumber());
            System.out.println(">>>>>> dateOfBirth ="+myRegister.getDateOfBirth());

            // TODO:
            model.addAttribute("myRegister", myRegister);
            return "register-result";
        }

}
