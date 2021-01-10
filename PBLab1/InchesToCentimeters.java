import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double inch = in.nextDouble();
        double centi = inch * 2.54;
        System.out.println(centi);
    }
}
