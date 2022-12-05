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
    @PostMapping("/issue")
    public String IssueBook(){
        return "welcome to the issue book page";
    }
    @PostMapping("/edit")
    public String EditBook(){
        return "welcome to book edit page";
    }
    @GetMapping("/view")
    public String ViewBook(){
        return "welcome to the view all book page";
    }
}
