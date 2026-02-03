import java.util.Scanner;

public class convertFarenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temprature in farenheit:");
        double farenheit = input.nextDouble();
        double celsius = (farenheit - 32) * 5 / 9;
        System.out.println("farenhite:" + farenheit + "in celsius is:" + celsius);
        input.close();

    }
}
