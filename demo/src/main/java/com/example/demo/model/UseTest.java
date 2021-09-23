package com.example.demo.model;

import com.example.demo.annotation.Test;

public class UseTest {
  public static void main(String[] args) {
    
    Class<Item> cla = Item.class;
    Test test = cla.getAnnotation(Test.class);

    if(test == null){
      return;
    }

    Item item = new Item(test.name());

    System.out.println(item.getItem());


  }
}
