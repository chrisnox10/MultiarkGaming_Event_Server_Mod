package com.hanaryoko.multiarkgamingeventservermod.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    private static final Logger LOGGER = LogManager.getLogger();

    private static void log(Level level, Object object){
        LOGGER.log(level,object);
    }
    public static void fatal(Object object){
        log(Level.FATAL, object);
    }
    public static void error(Object object){
        log(Level.ERROR, object);
    }
    public static void warn(Object object){
        log(Level.WARN, object);
    }
    public static void info(Object object){
        log(Level.INFO, object);
    }
    public static void debug(Object object){
        log(Level.DEBUG, object);
    }
    public static void trace(Object object){
        log(Level.TRACE, object);
    }
}
