package com.lyn0801.sprigboot.scheduled.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class FileWriteScheduled {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0/5 * * * * ? ")
    public void timer(){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("e:/test.txt", "rw");
            String date = sdf.format(new Date());
            log.info(date);
            byte[] ipBytes=date.getBytes();
            byte[] lineByte = "\n".getBytes();
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(ipBytes);
            randomAccessFile.write(lineByte);
            randomAccessFile.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
