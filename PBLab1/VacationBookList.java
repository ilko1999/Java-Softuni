import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pagesNumber = Integer.parseInt(in.nextLine());
        int pagesForHour = Integer.parseInt(in.nextLine());
        int numDays = Integer.parseInt(in.nextLine());

        int timeReading = pagesNumber / pagesForHour;
        int hrsDaily = timeReading / numDays;
        System.out.println(hrsDaily);

    }
}
