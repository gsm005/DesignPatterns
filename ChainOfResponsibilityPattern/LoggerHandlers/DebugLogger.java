package DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers;

import DesignPatterns.ChainOfResponsibilityPattern.LogType;
import DesignPatterns.ChainOfResponsibilityPattern.Logger;

public class DebugLogger extends Logger {
    public DebugLogger(Logger nextLogger){
        super(nextLogger);
        this.logType=LogType.DEBUG;
    }
}
