package com.example.demo.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CalcForm {
    @NotNull
    private Integer param1;
    @NotNull
    private Integer param2;
    @NotEmpty
    private String symbol;
  
    // getter.setter
    public Integer getParam1() {
      return param1;
    }
  
    public void setParam1(int param1) {
      this.param1 = param1;
    }
  
    public Integer getParam2() {
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
