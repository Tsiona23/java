import java.util.Scanner;

public class simpleAdditonQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers num1 and num2 please");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("what is num1 + num2 ? ");
        int answer = input.nextInt();
        if (answer == sum) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
        input.close();
    }
}
