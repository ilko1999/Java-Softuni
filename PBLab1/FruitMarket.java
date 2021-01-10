import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(in.nextLine());
        double bananaWeight = Double.parseDouble(in.nextLine());
        double orangeWeight = Double.parseDouble(in.nextLine());
        double raspberryWeight = Double.parseDouble(in.nextLine());
        double strawberryWeight = Double.parseDouble(in.nextLine());

        double raspberryPrice =  strawberryPrice * 0.50;
        double orangePrice = raspberryPrice - (raspberryPrice * 0.40);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.80);

        double strawberries = strawberryPrice * strawberryWeight;
        double oranges = orangePrice * orangeWeight;
        double raspberries = raspberryPrice * raspberryWeight;
        double bananas = bananaPrice * bananaWeight;

        double total = strawberries + oranges + raspberries + bananas;
        System.out.printf("%.02f", total);
    }
}
