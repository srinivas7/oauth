package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/user")
  public String test() {
    return "test data";
  }
}
