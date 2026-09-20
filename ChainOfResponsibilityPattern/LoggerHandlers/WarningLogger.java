package DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers;

import DesignPatterns.ChainOfResponsibilityPattern.LogType;
import DesignPatterns.ChainOfResponsibilityPattern.Logger;

public class WarningLogger extends Logger {
    public WarningLogger(Logger nextLogger){
        super(nextLogger);
        this.logType=LogType.WARN;
    }
}
