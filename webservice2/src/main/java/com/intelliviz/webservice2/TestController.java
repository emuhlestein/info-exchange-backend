package com.intelliviz.webservice2;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    // http://localhost:8080/api/test?name=Ed
    @RequestMapping("/api/test")
    public String getString(@RequestParam(required = false) String name) {
//        throw new IllegalArgumentException("{\"error\":\"The parameter is invalid\"}"
        return "Hello " + name;
    }

    @GetMapping("/api/test1/{id}")
    public String hello(@PathVariable("id") int id) {
        return "Your number is " + id;
    }
}
