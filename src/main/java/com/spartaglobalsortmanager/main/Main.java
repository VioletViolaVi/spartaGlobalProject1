package com.spartaglobalsortmanager.main;

import com.spartaglobalsortmanager.view.UsersChoicesInterface;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
        // calls whole project separated in super/subclasses & interfaces
        UsersChoicesInterface.userAnswers();

        Logger logger = Logger.getLogger("My Application Logger");

        PropertyConfigurator.configure("log4j.properties");
        logger.warn("This is a message");
        logger.info("This is a message");
        logger.error("This is a message");
        logger.fatal("This is a message");
    }
}
