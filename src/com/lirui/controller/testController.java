package com.lirui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lirui.service.IService;

@Controller
@RequestMapping(value = "/cntl")
public class testController{
	
    @Autowired
    private IService is;
    
	@RequestMapping(value = "/testMethod")
	public void testMethod() {
		System.out.println(is.testService());
	}
}