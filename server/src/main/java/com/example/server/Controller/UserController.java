package com.example.server.Controller;

import org.springframework.web.bind.annotation.*;
 

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
	
    @GetMapping("/")
    public String greet() {
        return "Hello from Java Backend";
    }
}
