import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = Double.parseDouble(in.nextLine());
        double h = Double.parseDouble(in.nextLine());

        double result = a * h / 2;
        System.out.printf("%.02f", result);
    }
}
