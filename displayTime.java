import java.util.Scanner;

public class displayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer in seconds:");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingsecondds = seconds % 60;
        System.out.println(seconds + "seconds is " + minutes + "minutes and" + remainingsecondds + "seconds");
        input.close();
    }
}
