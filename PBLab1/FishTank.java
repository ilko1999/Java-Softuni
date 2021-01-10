import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = Double.parseDouble(in.nextLine());
        double width = Double.parseDouble(in.nextLine());
        double height = Double.parseDouble(in.nextLine());
        double percent = Double.parseDouble(in.nextLine());

        double volumeAquarium = (length * width * height) * 0.001;
        double newPercent = percent * 0.01;
        double total = volumeAquarium * (1 - newPercent);
        System.out.printf("%.02f", total);



    }
}
