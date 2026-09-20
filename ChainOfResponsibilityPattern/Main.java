package DesignPatterns.ChainOfResponsibilityPattern;

import DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers.DebugLogger;
import DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers.ErrorLogger;
import DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers.InfoLogger;
import DesignPatterns.ChainOfResponsibilityPattern.LoggerHandlers.WarningLogger;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = new InfoLogger(
                new DebugLogger(
                        new ErrorLogger(
                                new WarningLogger(
                                        null))));

        loggerChain.logMessage("Code bomb planted. Will blast the whole servers in 10 seconds", LogType.WARN);
    }
}
