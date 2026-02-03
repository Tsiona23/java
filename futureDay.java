public class futureDay {
    public static void main(String[] args) {
        int today = 2; // let's say today is tusday
        int daysElapsed = 100;
        int futureDay = (today + daysElapsed) % 7;
        // display the future day
        System.out.println("the future day is " + futureDay);
        switch (futureDay) {
            case 0:
                System.out.println("the day will be sunday");
                break;
            case 1:
                System.out.println("the day will be monday");
                break;
            case 2:
                System.out.println("the day will be tusday ");
                break;
            case 3:
                System.out.println("the day will be wednsday");
                break;
            case 4:
                System.out.println("the day will be thursday");
                break;
            case 5:
                System.out.println("the day will be friday");
                break;
            case 6:
                System.out.println("the day will be saturday");
                break;
            default:

        }

    }
}
