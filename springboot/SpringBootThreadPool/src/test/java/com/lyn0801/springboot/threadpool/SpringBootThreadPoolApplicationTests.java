package com.lyn0801.springboot.threadpool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootThreadPoolApplicationTests {

	@Autowired
	private Task task;

	@Test
	public void test() throws Exception {

		task.doTaskOne();
		task.doTaskTwo();
		task.doTaskThree();
		Thread.currentThread().join();
	}

}
