package com.lyn0801.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class MybatisLogger {
    private static MybatisLogger mybatisLogger = null;
    private static Logger logger = null;
    private static LoggerContext context = null;
    private static String PATH = "static/log4jCfg.xml";

    public static MybatisLogger getInstance(){
        if(mybatisLogger == null){
            mybatisLogger = new MybatisLogger();
        }
        return mybatisLogger;
    }

    public static LoggerContext getContext(){
        if(context == null){
            context = (LoggerContext) LogManager.getContext(false);
            context.setConfigLocation(new File(PATH).toURI());
        }
        return context;
    }

    public static Logger getLogger(String className){
        if(logger == null){
            getContext();
            logger = LogManager.getLogger(className);
        }
        return logger;
    }
}
