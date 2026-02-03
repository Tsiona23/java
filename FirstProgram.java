import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello! I will add two whole numbers for you.");
        System.out.print("Enter two whole numbers separated by space: ");

        int num1 = 0, num2 = 0;
        Scanner keyboard = new Scanner(System.in);
        try {
            if (keyboard.hasNextInt()) {
                num1 = keyboard.nextInt();
            } else {
                System.out.println("First value is not an integer. Exiting.");
                return;
            }

            if (keyboard.hasNextInt()) {
                num2 = keyboard.nextInt();
            } else {
                System.out.println("Second value is not an integer. Exiting.");
                return;
            }

            System.out.println("The sum of those two numbers is: " + (num1 + num2));
        } finally {
            keyboard.close();
        }
    }
}
