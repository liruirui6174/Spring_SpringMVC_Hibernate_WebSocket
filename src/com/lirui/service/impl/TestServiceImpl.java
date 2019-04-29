package com.lirui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lirui.dao.IDao;
import com.lirui.model.TestModel;
import com.lirui.service.IService;
@Service
@Transactional
public class TestServiceImpl implements IService {

	@Autowired
	private IDao id;
	@Override
	public String testService() {
		return id.testDao();
	}
	@Override
	public TestModel getTest() {
		return id.getTest();
	}
	@Override
	public void saveTest(TestModel tm) {
		id.saveTest(tm);
	}
}
