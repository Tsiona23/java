import java.util.Scanner;

public class cualculateFactorialUsingForLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers to calculate factorial of first number upto second number");
        int n = input.nextInt();
        int fact = input.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(" factorial of " + n + " is " + fact);
        input.close();
    }
}
