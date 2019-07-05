package com.lyn0801.springboot.config.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class AutoRefreshConfiguration {
    @Autowired
    private ContextRefresher contextRefresher;

    @Scheduled(fixedRate = 60000L)
    public void autoRefreshConfig() {
        contextRefresher.refresh();
    }
}
