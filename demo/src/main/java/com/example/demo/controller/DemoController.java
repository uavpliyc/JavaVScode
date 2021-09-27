package com.example.demo.controller;

import com.example.demo.model.CalcModel;
import com.example.demo.form.CalcForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

  // calcメソッド
  @RequestMapping(value = "/calc", method = RequestMethod.GET)
  public String calc() {
    return "/calc";
  }

  // resultメソッド
  @RequestMapping(value = "/result")
  public ModelAndView result(ModelAndView mav, @Validated CalcForm form, BindingResult result) {
    if (!result.hasErrors()) {
      // セッション情報登録
      Integer calcResult = CalcModel.Calculate(form.getParam1(), form.getSymbol(), form.getParam2());
      mav.addObject("calcResult", calcResult);
      // 転送
      mav.setViewName("/result");
    } else {
      // 転送
      mav.setViewName("calc");
    }
    return mav;
  }
}
