public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 12;

        // Adjust for GMT+3
        currentHour = (currentHour + 3) % 12;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+3");
    }
}
