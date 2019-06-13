package com.lyn0801.springboot.threadpool;

import java.util.Calendar;

public class MyThread extends Thread {
    private Calendar lastDaily;
    @Override
    public void run() {
        while(true){
            Calendar now = Calendar.getInstance();
            if (now.get(Calendar.HOUR_OF_DAY) == 0 || lastDaily == null)
            {
                if (lastDaily == null
                        || now.get(Calendar.DAY_OF_YEAR) - lastDaily.get(Calendar.DAY_OF_YEAR) >= 1
                        || now.get(Calendar.YEAR) > lastDaily.get(Calendar.YEAR))
                {
                        System.out.println(now.getTime() + ":MonitorStateThread:send daily mail");
                    lastDaily = now;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
