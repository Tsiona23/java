import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        // Formatter to display time in HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) { // Infinite loop to keep updating time
            LocalTime currentTime = LocalTime.now(); // Get current time
            String formattedTime = currentTime.format(formatter); // Format time
            System.out.print("\rCurrent time: " + formattedTime); // \r moves cursor to start
            Thread.sleep(1000); // Wait for 1 second
        }
    }
}
