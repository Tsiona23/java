import java.util.Scanner;

public class computeAverage {
    public static void main(String[] args) {
        System.out.println("this program computes the average of the numbers u enter");
        System.out.println("enter three numbers separated by spaces and type a letter when u're done:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("the average of the numbers u entered is:" + average);
        input.close();

    }
}
