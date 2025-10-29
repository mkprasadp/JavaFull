package com.example.server.Controller;

import org.springframework.web.bind.annotation.*;
 

@RestController
@CrossOrigin(origins = {"https://69021182b7b9b4866f759c76--javafull.netlify.app/"})
public class UserController {
	
    @GetMapping("/")
    public String greet() {
        return "Hello from Java Backend";
    }

    @GetMapping("/mess")
    public String message(){
        return "This is a message from the backend";
    }
}
