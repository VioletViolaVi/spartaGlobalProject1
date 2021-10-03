package com.spartaglobalsortmanager.main;

import com.spartaglobalsortmanager.view.UsersChoicesInterface;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
        // calls whole project separated in super/subclasses & interfaces
        UsersChoicesInterface.userAnswers();

        // testing random numbers being placed in order
        RandomNumTest randomNumTest = new RandomNumTest();
        randomNumTest.numArrInOrder();

        // log4j tests
        Logger logger = Logger.getLogger("Application Logger");
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("Warning message");
        logger.info("Info message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}
