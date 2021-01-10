import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radians = Double.parseDouble(in.nextLine());
        double degrees = radians * 180/Math.PI;
        System.out.printf("%.0f", degrees);
    }
}
