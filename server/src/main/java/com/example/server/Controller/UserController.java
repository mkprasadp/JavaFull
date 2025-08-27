package com.example.server.Controller;

import org.springframework.web.bind.annotation.*;
 

@RestController
@CrossOrigin(origins = {"https://java-full.vercel.app"})
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
