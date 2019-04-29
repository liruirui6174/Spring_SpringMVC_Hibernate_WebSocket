package com.lirui.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "testModel")
public class TestModel {
  
	@Id
	public String property_A;
	
	@Column(name = "property_b")
	public String property_b;

}
