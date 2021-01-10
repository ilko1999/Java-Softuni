import java.io.IOException;
import java.util.Scanner;

public class SqareArea {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int result = 0;
        result = side * side;
        System.out.println(result);
    }
}
