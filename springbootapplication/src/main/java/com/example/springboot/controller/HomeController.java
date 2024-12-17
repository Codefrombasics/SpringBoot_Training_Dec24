package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cfb")
public class HomeController {
    @GetMapping("/hello")  //localhost:8080/cfb/hello
    public String demo(){
        return "Welcome to Spring Boot";
    }
    @GetMapping("/hi5")
    public String demo2(){
        return "Welcome to Spring Boot 3 code fro basics";
    }

//    @GetMapping("/{id}")
//    public String getId(@PathVariable("id") int id1){//we can user our own variable name, instead of using ID
//        return "Id is "+id1;
//    }
    @GetMapping("/{id1}/{id2}")
    public String getId(@PathVariable("id1") int id1,@PathVariable("id2") int id2){//we can user our own variable name, instead of using ID
        return "Id is "+id1+" id2 is "+id2;
    }

    @GetMapping("/{id1}")
    public ResponseEntity<String> getId(@PathVariable("id1") Integer id1){//we can user our own variable name, instead of using ID
        return ResponseEntity.ok("Welcome"+id1);
    }
@GetMapping("/search")
public String getId(@RequestParam(value = "name",required = false,defaultValue = "give value") String name){//we can user our own variable name, instead of using ID
    return "Your name is "+name;
}
}
