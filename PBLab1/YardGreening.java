import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = in.nextDouble();
        double greening = (meters * 7.61);
        double discount =  Math.abs(greening * 0.18);
        double result = Math.abs(greening - discount);
        System.out.printf("The final price is: %f lv.", result);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);
    }
}
