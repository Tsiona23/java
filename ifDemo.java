import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter an integer :");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("hi five");
        }
        if (number % 2 == 0) {
            System.out.println("hi even");
        }
        input.close();
    }
}
