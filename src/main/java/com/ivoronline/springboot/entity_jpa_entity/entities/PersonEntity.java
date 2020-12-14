package com.ivoronline.springboot.entity_jpa_entity.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {

  @Id
  public Long    id;
  public String  name;
  public Integer age;

}




