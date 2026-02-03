import java.util.Scanner;

public class compareToNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers ");
        int a = input.nextInt();
        int b = input.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("the larger one is " + max);
        input.close();
    }
}
