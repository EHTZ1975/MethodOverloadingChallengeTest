public class TestClass {
    public static void main(String[] args) {

        double test1 = getDurationString(47, 49);
        double test2 = getDurationString(49);
        
    }

    public static double getDurationString(int seconds) {

        if (seconds >= 0) {

            double durationHours = seconds / 3600d;
            int hours = (int) durationHours;
            double durationMinutes = durationHours * 60d;
            int minutes = (int) durationMinutes;
            double durationSeconds = (durationMinutes - (int) durationMinutes) * 60;
            int finalSeconds = (int) durationSeconds;

            System.out.println("++++++++++++++++++");
            System.out.println(hours + "h " + minutes + "m " + finalSeconds + "s ");
            System.out.println("++++++++++++++++++");

        } return seconds / 3600d;
    }

    public static int getDurationString( int minutes, int seconds){

        if ((minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59)) {

            int totalSeconds = (minutes * 60) + seconds;
            double totalHours = getDurationString(totalSeconds);
            int hours = (int) totalHours;
            double remainingMinutes = totalHours * 60d;
            int newMinutes = (int) remainingMinutes;
            double remainingSeconds = (remainingMinutes - (int) remainingMinutes) * 60;
            int newSeconds = (int) remainingSeconds;

            System.out.println("++++++++++++++++++");
            System.out.println(hours + "h " + newMinutes + "m " + newSeconds + "s ");
            System.out.println("++++++++++++++++++");

        } else {
            System.out.println("invalid value");
            return 1;
        } return 0;
    }
}