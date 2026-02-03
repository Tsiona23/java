import java.util.Scanner;

public class getUsersInfo {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter ur age:");
        age = input.nextInt();
        input.nextLine(); // consume the leftover newline
        System.out.println("please enter ur name:");
        name = input.nextLine();
        System.out.println("ur name is " + name + " and u're " + age + " years old.");
        input.close();

    }
}
