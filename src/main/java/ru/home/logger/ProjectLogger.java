package ru.home.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectLogger {
    private static final LoggerHandlerLoader HANDLER_LOADER = new LoggerHandlerLoader();
    private final Logger classLogger;

    public ProjectLogger(Class<?> key) {
        classLogger = Logger.getLogger(key.getName());
        classLogger.addHandler(HANDLER_LOADER.getHandler());
    }
    public void trace(String msg) {
        classLogger.log(Level.FINER, msg);
    }

    public void trace(Throwable e) {
        classLogger.log(Level.FINER, e.getMessage(), e);
    }

    public void trace(String msg, Throwable e) {
        classLogger.log(Level.FINER, msg, e);
    }

    public void debug(String msg) {
        classLogger.log(Level.FINE, msg);
    }

    public void debug(Throwable e) {
        classLogger.log(Level.FINE, e.getMessage(), e);
    }

    public void debug(String msg, Throwable e) {
        classLogger.log(Level.FINE, msg, e);
    }

    public void info(String msg) {
        classLogger.log(Level.INFO, msg);
    }

    public void info(String msg, Throwable e) {
        classLogger.log(Level.INFO, msg, e);
    }

    public void warn(String msg) {
        classLogger.log(Level.WARNING, msg);
    }

    public void warn(String msg, Throwable e) {
        classLogger.log(Level.WARNING, msg, e);
    }

    public void error(String msg) {
        classLogger.log(Level.SEVERE, msg);
    }

    public void error(String msg, Throwable e) {
        classLogger.log(Level.SEVERE, msg, e);
    }

    public void error(Throwable e) {
        classLogger.log(Level.SEVERE, e.getMessage(), e);
    }

    public void info(Throwable e) {
        classLogger.log(Level.INFO, e.getMessage(), e);
    }

    public void warn(Throwable e) {
        classLogger.log(Level.WARNING, e.getMessage(), e);
    }
}
