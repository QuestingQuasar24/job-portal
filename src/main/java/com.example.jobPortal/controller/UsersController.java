package com.example.jobPortal.controller;

import com.example.jobPortal.entity.Users;
import com.example.jobPortal.entity.UsersType;
import com.example.jobPortal.services.UsersService;
import com.example.jobPortal.services.UsersTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Controller

public class UsersController {
    private final UsersTypeService usersTypeService;
    private final UsersService usersService;
    @Autowired
    public UsersController(UsersTypeService usersTypeService , UsersService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String register(Model model){
        List<UsersType> usersTypes = usersTypeService.getAll();
        model.addAttribute("getAllTypes" , usersTypes);
        model.addAttribute("user" , new Users());
        return "register";
    }
    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users , Model model){
        Optional<Users> optionalUsers = usersService.getUserByEmail(users.getEmail());

        if(optionalUsers.isPresent()){
            model.addAttribute("error" , "email already registered,try to login or register with othwr emwil.");
            List<UsersType> usersTypes = usersTypeService.getAll();
            model.addAttribute("getAllTypes" , usersTypes);
            model.addAttribute("user" , new Users());
            return "register";
        }
        //System.out.println("User:: " +users);
        usersService.addNew(users);
        return "dashboard";

    }
}
