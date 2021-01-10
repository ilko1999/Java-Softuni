import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dogs = in.nextInt();
        int otherAnimals = in.nextInt();
        double result = 0;
        result = ((dogs * 2.5) + (otherAnimals * 4));
        System.out.printf("%f lv.", result);
    }
}
