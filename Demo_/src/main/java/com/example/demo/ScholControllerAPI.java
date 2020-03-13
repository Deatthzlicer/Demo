package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("SchoolController")
public class ScholControllerAPI {
 
    @GetMapping("/{location},{degree},{year}", produces = "application/json")
    public @ResponseBody TableForm getBook(@PathVariable int location,(@PathVariable int degree,(@PathVariable int year) {
    	
    	DemoForm df = new DemoFrom(location,degree,year);
    return parseFormtoRequest(df);
    }
        
    }

