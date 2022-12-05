package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @GetMapping("/")
    public String HomePage(){
        return "welcome to library home page";
    }
    @PostMapping("/add")
    public String LibraryAdd(){
        return "welcome to the library add page";
    }
    @PostMapping("/search")
    public String LibrarySearch(){
        return "welcome to the library search page";
    }
}
