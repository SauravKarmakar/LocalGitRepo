public class Logger {

    private enum LoggingType { INFO, DEBUG, FINE, FINEST}
    private String loggingType = "INFO";
    private boolean debug = false;

    public Logger() {
        this.loggingType = LoggingType.INFO;
        this.debug = false;
    }

    public String getLoggerType() { return this.loggingType; }

    public void setLoggerType(String loggingType) {}

    // checks whether debug is enabled or not
    public boolean isDebugEnabled() { return this.debug; }
}