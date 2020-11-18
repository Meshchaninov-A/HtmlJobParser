package ru.home;

import ru.home.logger.ProjectLogger;

public class FakeClass {
    private ProjectLogger logger = new ProjectLogger(FakeClass.class);


    public void viewMessage() {
        logger.info("Fake.classs");
    }
}
