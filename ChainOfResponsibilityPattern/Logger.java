package DesignPatterns.ChainOfResponsibilityPattern;

public abstract class Logger {
    protected Logger nextLogger;
    protected LogType logType;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message, LogType incomingType) {
        if (this.logType == incomingType) {
            System.out.println(this.logType + ": " + message);
            return;
        }

        if (nextLogger != null) {
            nextLogger.logMessage(message, incomingType);
            return;
        }

        System.out.println("UNKNOWN: " + message);
    }

    public void LogMessage(String message, LogType incomingType) {
        logMessage(message, incomingType);
    }
}
