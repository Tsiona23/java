import java.util.Scanner;

public class identifyPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter any number:");
        double num = input.nextDouble();
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        input.close();
    }
}
