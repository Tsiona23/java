import java.util.Scanner;

public class forLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive integer");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
        input.close();
    }
}
