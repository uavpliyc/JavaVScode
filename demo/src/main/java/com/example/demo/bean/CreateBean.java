package com.example.demo.bean;

import com.example.demo.model.CalcModel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {
  
  @Bean
  public CalcModel calc(){
    return new CalcModel();
  }

}
