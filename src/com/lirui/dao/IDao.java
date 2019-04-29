package com.lirui.dao;

import com.lirui.model.TestModel;

public interface IDao {
   
	String testDao();

	TestModel getTest();

	void saveTest(TestModel tm);
}
