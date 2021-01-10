import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bgn = in.nextDouble();
        double usd = bgn * 1.79549;
        System.out.println(usd);

    }
}
