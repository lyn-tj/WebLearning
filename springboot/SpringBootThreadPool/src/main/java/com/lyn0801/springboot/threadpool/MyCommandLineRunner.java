package com.lyn0801.springboot.threadpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private Task task;
    @Override
    public void run(String... args) throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }
}
