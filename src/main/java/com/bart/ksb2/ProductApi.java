package com.bart.ksb2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {

//    PARAMETER
//    @GetMapping
//    public String getProducts(@RequestParam String name,
//                              @RequestParam(required = false, defaultValue = "") String surname) {
//        return "Hello " + name + " " + surname;
//    }

//    PATH
//    @GetMapping("/{name}")
//    public String getProducts(@PathVariable String name) {
//        return "Hello " + name;
//    }

//    HEADER
//    @GetMapping
//    public String getProducts(@RequestHeader String name) {
//        return "Hello " + name;
//    }

//    BODY
//    @GetMapping
//    public String getProducts(@RequestBody String name) {
//        return "Hello " + name;
//    }

    @GetMapping
    public String getProducts(@RequestParam String name,
                              @RequestHeader(required = false, defaultValue = "") String surname) {
        return "Hello " + name + " " + surname;
    }

    @PostMapping
    public String addProducts() {
        return "Hello World with POST";
    }

    @PutMapping
    public String modProducts() {
        return "Hello World with PUT";
    }

    @DeleteMapping
    public String removeProducts() {
        return "Hello World with DELETE";
    }
}
