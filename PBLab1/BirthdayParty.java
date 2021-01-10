import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hallRent = Double.parseDouble(in.nextLine());
        double cake = (hallRent * 20) /100;
        double drinks = cake - ((cake * 45) / 100);
        double animator = hallRent / 3;
        double result = hallRent + cake+drinks+animator;
        System.out.println(result);

    }
}
