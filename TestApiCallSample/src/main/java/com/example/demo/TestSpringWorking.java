package com.example.demo;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("Test")
public class TestSpringWorking {



public class ScholControllerAPI {
 
    @GetMapping("/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

/**
 * 
 * it doenst work
 * 
 */
}
