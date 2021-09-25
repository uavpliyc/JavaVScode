package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

  @RequestMapping(value = "/demo", method = RequestMethod.POST)
  public void method(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", "Hello Thymeleaf");
    model.addAttribute("text", name);
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    model.addAttribute("list", list);

  }
}
