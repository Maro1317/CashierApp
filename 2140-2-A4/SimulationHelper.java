public class SimulationHelper {
    public static final String NO_TRAINS_SCHEDULE = "No trains are scheduled.";
    public static final String HEAP_EMPTY = "Heap is empty.";
    
    public static String formatTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return String.format("%02d:%02d", hours, minutes);
    }
    
    public static void logEvent(int time, String event) {
        System.out.println(formatTime(time) + ": " + event);
    }
    
    public static String formatDeparture(String trainName, String platform) {
        return "Train " + trainName + " departs from " + platform + ".";
    }
    
    public static String formatArrival(String trainName, String platformName) {
        return "Train " + trainName + " arrives at platform " + platformName;
    }
    
    public static void logTrainMovement(Train currentTrain, String platformName) {
        logEvent(currentTrain.getArrival(), formatArrival(currentTrain.getName(), platformName));
        logEvent(currentTrain.getDeparture(), formatDeparture(currentTrain.getName(), platformName));
    }
}
