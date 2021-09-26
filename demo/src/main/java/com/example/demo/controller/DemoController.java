package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

  @RequestMapping(value = "/calc", method = RequestMethod.GET)
  public String calc() {
    return "/calc";
  }

  @RequestMapping(value = "/result", method = RequestMethod.POST)
  public ModelAndView result(@RequestParam(name = "param1", required = false) Integer param1,
      @RequestParam(name = "param2", required = false) Integer param2,
      @RequestParam(name = "symbol", required = false) String symbol, ModelAndView mav, @Validated form form,
      BindingResult result) {
    if (result.hasErrors()) {
    }

    // セッション情報登録
    mav.addObject("param1", param1);
    mav.addObject("param2", param2);
    mav.addObject("symbol", symbol);
    // 転送
    mav.setViewName("/result");
    return mav;
  }
}

class form {
  private int param1;
  private int param2;
  private String symbol;

  // getter.setter
  public int getParam1() {
    return param1;
  }

  public void setParam1(int param1) {
    this.param1 = param1;
  }

  public int getParam2() {
    return param2;
  }

  public void setParam2(int param2) {
    this.param1 = param2;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }
}
