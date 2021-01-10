import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double charityDays = Double.parseDouble(in.nextLine());
        double confectioners = Double.parseDouble(in.nextLine());
        double numCakes = Double.parseDouble(in.nextLine());
        double numWaffles = Double.parseDouble(in.nextLine());
        double numPancakes = Double.parseDouble(in.nextLine());

        double cakePrice = numCakes * 45.0;
        double wafflePrice = numWaffles * 5.80;
        double pancakesPrice = numPancakes * 3.20;

        double totalForOneDay = (cakePrice + wafflePrice + pancakesPrice) * confectioners;
        double totalCampaign = totalForOneDay * charityDays;
        double costs = totalCampaign - (totalCampaign / 8);
        System.out.printf("%.02f",costs);

    }
}
