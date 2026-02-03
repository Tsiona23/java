import java.util.Scanner;

public class computeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // declare a constant for PI
        System.out.println("this program computes the area for a circle");
        // create a scanner object to read input
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");// prompt the user to enter the radius
        double radius = input.nextDouble();
        double area = PI * radius * radius; // compute the area
        System.out.println("the area of the circle with radius " + radius + " is: " + area);
        input.close();
    }
}
