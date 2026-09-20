package DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers;

import DesignPatterns.ChainOfResponsibilityPattern.LogType;
import DesignPatterns.ChainOfResponsibilityPattern.Logger;

public class InfoLogger extends Logger {
    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
        this.logType=LogType.INFO;
    }
}
