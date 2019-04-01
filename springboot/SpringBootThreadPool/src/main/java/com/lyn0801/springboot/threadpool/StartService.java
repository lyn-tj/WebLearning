package com.lyn0801.springboot.threadpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class StartService implements ApplicationRunner {
    @Autowired
    private Task task;
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        task.doTaskOne();
//        task.doTaskTwo();
//        task.doTaskThree();
    }
}
