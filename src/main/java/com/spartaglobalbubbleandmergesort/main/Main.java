package com.spartaglobalbubbleandmergesort.main;

import com.spartaglobalbubbleandmergesort.view.UsersChoicesInterface;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
        UsersChoicesInterface.userAnswers();

        Logger logger = Logger.getLogger("My Application Logger");

        PropertyConfigurator.configure("log4j.properties");
        logger.warn("This is a message");
        logger.info("This is a message");
        logger.error("This is a message");
        logger.fatal("This is a message");
    }
}
