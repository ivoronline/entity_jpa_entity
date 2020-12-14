package com.ivoronline.springboot.entity_jpa_entity.controllers;

import com.ivoronline.springboot.entity_jpa_entity.entities.PersonEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  PersonEntity personEntity = new PersonEntity();

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    personEntity.name = "John";
    String name = personEntity.name;
    return "Hello " + name;
  }

}
