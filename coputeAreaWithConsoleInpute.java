import java.util.Scanner;

public class coputeAreaWithConsoleInpute {
    public static void main(String[] args) {
        // create scanner object and ensure it is closed automatically
        try (Scanner input = new Scanner(System.in)) {
            // prompt the user to enter radius
            System.out.println("enter number for radius");
            double radius = input.nextDouble();
            // compute area
            double area = 3.14159 * radius * radius;
            // display results
            System.out.println("the area for the circle of the radius " + radius + " is " + area);
        }
    }

}
