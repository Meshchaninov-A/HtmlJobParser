package ru.home.logger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

class LoggerHandlerLoader {
    private static final File LOG_FILE = new File("UtilLogging.log");
    private FileHandler handler = null;

    LoggerHandlerLoader() {
        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("logging.properties");
            if (in != null) {
                LogManager.getLogManager().readConfiguration(in);
            } else {
                System.err.println("No such logging.properties file");
            }
        } catch (IOException e) {
            System.err.println("Failed to load logging.properties in classpath: " + e.getMessage());
        }
        try {
            handler = new FileHandler(LOG_FILE.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Handler not created: " + e.getMessage());
        }
    }

    FileHandler getHandler() {
        return handler;
    }
}
