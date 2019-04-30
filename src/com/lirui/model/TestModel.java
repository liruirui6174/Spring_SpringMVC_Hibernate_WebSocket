package com.lirui.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//使用@Data注解 就不用写get，set方法了  挺方便的 此注解在Lombok.jar中  强烈推荐
@Data
@Entity
@Table(name = "testModel")
public class TestModel {
  
	@Id
	public String property_A;
	
	@Column(name = "property_b")
	public String property_b;

}
