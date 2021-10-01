package com.spartatestingtestcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
    private static Logger logger = Logger.getLogger("My Application Logger");
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("This is a message");
    }
}
