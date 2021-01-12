import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = Double.parseDouble(in.nextLine());

        double fahrenheit = celsius * 1.8 + 32.0;
        System.out.printf("%.02f", fahrenheit);
    }
}
