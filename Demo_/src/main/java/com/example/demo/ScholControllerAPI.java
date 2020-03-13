package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("SchoolController")
public class ScholControllerAPI {
 
    @GetMapping("/{location},{degree},{year]}", produces = "application/json")
    public @ResponseBody DemoForm getBook(@PathVariable int location,(@PathVariable int degree,(@PathVariable int year) {
        return parseFormtoRequest(id);
    }

