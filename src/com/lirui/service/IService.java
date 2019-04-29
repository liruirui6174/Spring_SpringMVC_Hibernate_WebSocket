package com.lirui.service;

import com.lirui.model.TestModel;

public interface IService {
 String testService();

TestModel getTest();

void saveTest(TestModel tm);
}
