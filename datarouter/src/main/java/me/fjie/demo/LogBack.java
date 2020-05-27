package me.fjie.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBack {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        LogBack logback = new LogBack();
        logback.testLog();
    }

    private void testLog() {
        System.out.println("Hello, world, log4j");
        logger.debug("print debug log.");
        logger.info("print info log.");
        logger.error("print error log.");
    }
}
