import java.util.Scanner;

public class orderOneCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the cities:");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        if (city1.compareTo(city2) < 0) {
            System.out.println("cities in Alphabetical order are:" + city1 + " " + city2);
        } else {
            System.out.println("cities in alphabetical order are :" + city2 + " " + city1);
        }

        input.close();
    }
}
