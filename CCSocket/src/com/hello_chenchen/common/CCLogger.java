package com.hello_chenchen.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;


/**
 * Created by hello_chenchen on 2017/3/19.
 * jdk_version:jdk1.8.0_111
 */
public class CCLogger {

    private static Logger logger = LoggerFactory.getLogger(CCLogger.class);

    public static void trace(String var1){
        logger.trace(var1);
    };

    public static void trace(String var1, Object var2){
        logger.trace(var1, var2);
    };

    public static void trace(String var1, Object var2, Object var3){
        logger.trace(var1, var2, var3);
    };

    public static void trace(String var1, Object... var2){
        logger.trace(var1, var2);
    };

    public static void trace(String var1, Throwable var2){
        logger.trace(var1, var2);
    };

    public static void trace(Marker var1, String var2){
        logger.trace(var1, var2);
    };

    public static void trace(Marker var1, String var2, Object var3){
        logger.trace(var1, var2, var3);
    };

    public static void trace(Marker var1, String var2, Object var3, Object var4){
        logger.trace(var1, var2, var3, var4);
    };

    public static void trace(Marker var1, String var2, Object... var3){
        logger.trace(var1, var2, var3);
    };

    public static void trace(Marker var1, String var2, Throwable var3){
        logger.trace(var1, var2, var3);
    };

    public static void debug(String var1){
        logger.debug(var1);
    };

    public static void debug(String var1, Object var2){
        logger.debug(var1, var2);
    };

    public static void debug(String var1, Object var2, Object var3){
        logger.debug(var1, var2, var3);
    };

    public static void debug(String var1, Object... var2){
        logger.debug(var1, var2);
    };

    public static void debug(String var1, Throwable var2){
        logger.debug(var1, var2);
    };

    public static void debug(Marker var1, String var2){
        logger.debug(var1, var2);
    };

    public static void debug(Marker var1, String var2, Object var3){
        logger.debug(var1, var2, var3);
    };

    public static void debug(Marker var1, String var2, Object var3, Object var4){
        logger.debug(var1, var2, var3, var4);
    };

    public static void debug(Marker var1, String var2, Object... var3){
        logger.debug(var1, var2, var3);
    };

    public static void debug(Marker var1, String var2, Throwable var3){
        logger.debug(var1, var2, var3);
    };

    public static void info(String var1){
        logger.info(var1);
    };

    public static void info(String var1, Object var2){
        logger.info(var1, var2);
    };

    public static void info(String var1, Object var2, Object var3){
        logger.info(var1, var2, var3);
    };

    public static void info(String var1, Object... var2){
        logger.info(var1, var2);
    };

    public static void info(String var1, Throwable var2){
        logger.info(var1, var2);
    };

    public static void info(Marker var1, String var2){
        logger.info(var1, var2);
    };

    public static void info(Marker var1, String var2, Object var3){
        logger.info(var1, var2, var3);
    };

    public static void info(Marker var1, String var2, Object var3, Object var4){
        logger.info(var1, var2, var3, var4);
    };

    public static void info(Marker var1, String var2, Object... var3){
        logger.info(var1, var2, var3);
    };

    public static void info(Marker var1, String var2, Throwable var3){
        logger.info(var1, var2, var3);
    };

    public static void warn(String var1){
        logger.warn(var1);
    };

    public static void warn(String var1, Object var2){
        logger.warn(var1, var2);
    };

    public static void warn(String var1, Object... var2){
        logger.warn(var1, var2);
    };

    public static void warn(String var1, Object var2, Object var3){
        logger.warn(var1, var2, var3);
    };

    public static void warn(String var1, Throwable var2){
        logger.warn(var1, var2);
    };

    public static void warn(Marker var1, String var2){
        logger.warn(var1, var2);
    };

    public static void warn(Marker var1, String var2, Object var3){
        logger.warn(var1, var2, var3);
    };

    public static void warn(Marker var1, String var2, Object var3, Object var4){
        logger.warn(var1, var2, var3, var4);
    };

    public static void warn(Marker var1, String var2, Object... var3){
        logger.warn(var1, var2, var3);
    };

    public static void warn(Marker var1, String var2, Throwable var3){
        logger.warn(var1, var2, var3);
    };

    public static void error(String var1){
        logger.error(var1);
    };

    public static void error(String var1, Object var2){
        logger.error(var1, var2);
    };

    public static void error(String var1, Object var2, Object var3){
        logger.error(var1, var2, var3);
    };

    public static void error(String var1, Object... var2){
        logger.error(var1, var2);
    };

    public static void error(String var1, Throwable var2){
        logger.error(var1, var2);
    };

    public static void error(Marker var1, String var2){
        logger.error(var1, var2);
    };

    public static void error(Marker var1, String var2, Object var3){
        logger.error(var1, var2,var3);
    };

    public static void error(Marker var1, String var2, Object var3, Object var4){
        logger.error(var1, var2, var3, var4);
    };

    public static void error(Marker var1, String var2, Object... var3){
        logger.error(var1, var2, var3);
    };

    public static void error(Marker var1, String var2, Throwable var3){
        logger.error(var1, var2, var3);
    };
}
