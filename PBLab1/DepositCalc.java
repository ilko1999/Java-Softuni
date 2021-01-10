import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double depositedSum = Double.parseDouble( in.nextLine());
        int months = Integer.parseInt(in.nextLine());
        double yearlyPercent = Double.parseDouble(in.nextLine());

        double accruedInterest = depositedSum * yearlyPercent /100;
        double monthlyInterest = accruedInterest /12;

        double sum = depositedSum + (months * accruedInterest / 12);
        System.out.println(sum);

    }
}
