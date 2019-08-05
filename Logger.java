public class Logger {

    private enum LoggingType { INFO, DEBUG, FINE, FINEST}
    private String loggingType = "INFO";

    public Logger() {
        this.loggingType = LoggingType.INFO;
    }

    public String getLoggerType() { return loggingType; }

    public void setLoggerType(String loggingType) {}
}