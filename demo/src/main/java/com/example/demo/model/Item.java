package com.example.demo.model;

import com.example.demo.annotation.Test;

@Test(name = "sample123")
public class Item {
  private String name;

  public Item(String name) {
    super();
    this.name = name;
  }

  public String getItem() {
    return name;
  }
}
