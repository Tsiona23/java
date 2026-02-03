import java.util.Scanner;

public class forLoopExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter any positive number:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("5 x " + i + "=" + (5 * i));
        }
        input.close();
    }

}
