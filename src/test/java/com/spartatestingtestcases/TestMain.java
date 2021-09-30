package com.spartatestingtestcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestMain {
    private static Logger logger = Logger.getLogger("My Application Logger");
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("This is a message");
    }
}
