import java.util.Scanner;

public class AssignVolenteer {
    public static void main(String[] args) {
        int donationtType;
        String volenteer;
        final int CLOSING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOSING_PRICER = "Temesgen";
        final String OTHER_PRICER = "Abebe";
        Scanner input = new Scanner(System.in);
        System.out.println("what type of donaton is this ?");
        System.out
                .println("eneter " + CLOSING_CODE + " for closing code " + OTHER_CODE + " for other type of donation ");
        donationtType = input.nextInt();
        if (donationtType == CLOSING_CODE) {
            volenteer = CLOSING_PRICER;
        } else {
            volenteer = OTHER_PRICER;
        }
        System.out.println("u entered " + donationtType);
        System.out.println("the valu u enterd is assigned to volenteer " + volenteer);
        input.close();
    }

}
