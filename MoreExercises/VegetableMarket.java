import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double firstRow = Double.parseDouble(in.nextLine());
        double secondRow = Double.parseDouble(in.nextLine());
        double thirdRow = Double.parseDouble(in.nextLine());
        double fourthRow = Double.parseDouble(in.nextLine());

        double vegetables = firstRow * thirdRow;
        double fruits = secondRow * fourthRow;
        double all = vegetables + fruits;
        System.out.printf("%.02f", all);

    }

}
