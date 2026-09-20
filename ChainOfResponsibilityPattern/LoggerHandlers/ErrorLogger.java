package DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers;

import DesignPatterns.ChainOfResponsibilityPattern.LogType;
import DesignPatterns.ChainOfResponsibilityPattern.Logger;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger){
        super(nextLogger);
        this.logType=LogType.ERROR;
    }
}
