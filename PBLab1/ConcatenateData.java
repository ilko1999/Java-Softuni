import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) throws IOException {
        //You are <firstName> <lastName>, a <age>-years old person from <town>.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String lastName = reader.readLine();
        String age = reader.readLine();
        String town = reader.readLine();

        System.out.printf("You are %s %s, a %s-years old person from %s.",firstName,lastName,age,town);
    }
}
