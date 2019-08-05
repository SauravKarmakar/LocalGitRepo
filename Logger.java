public class Logger {

    private enum LoggingType { INFO, DEBUG, FINE, FINEST}
    private String loggingType = "INFO";
    private boolean debug = false;

    public Logger() {
        this.loggingType = LoggingType.INFO;
        this.debug = false;
    }

    public String getLoggerType() { return loggingType; }

    public void setLoggerType(String loggingType) {}

    public boolean isDebugEnabled() { return debug; }
}