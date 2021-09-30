package com.spartatestingtestcases;

import com.spartaglobalbubbleandmergesort.main.Main;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestMain {
    // for testing:
    private static Logger logger = Logger.getLogger("My Application Logger");

    public static void testingMain() {
        // for testing:
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("This is a message");
    }
}
