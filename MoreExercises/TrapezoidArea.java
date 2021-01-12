import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b1 = Double.parseDouble(in.nextLine());
        double b2 = Double.parseDouble(in.nextLine());
        double h = Double.parseDouble(in.nextLine());

        double result = (b1 + b2) * h / 2.0;
        System.out.printf("%.02f", result);
    }

}
