import java.util.Scanner;

public class convertCelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter temprature in celsius");
        double celsius = input.nextDouble();
        double farenheit = (celsius + 32) * 5 / 9;
        System.out.println("celsius:" + celsius + "in farenheit is :" + farenheit);
        input.close();
    }
}
