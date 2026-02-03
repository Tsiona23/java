public class MilesTokilometers {
    public static void main(String[] args) {
        System.out.println("hello i will convert miles to kilometers");
        double miles = 100; // declering miles
        final double KILOMETERS_PER_MILE = 1.609; // declering constant for conversion
        double kilometers = miles * KILOMETERS_PER_MILE;// conversion formula
        System.out.println("100 miles is equal to " + kilometers + "kilometers");// output result
    }
}
