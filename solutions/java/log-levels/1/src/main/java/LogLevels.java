public class LogLevels {
    
    public static String message(String logLine) {
        String[] myMessage = logLine.split(":");
        
        return myMessage[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] myMessage = logLine.split(":");
        
        return myMessage[0].substring(1,myMessage[0].length() - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
