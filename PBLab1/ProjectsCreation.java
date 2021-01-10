import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        //The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s.
        //1 proekt 3 chasa
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        //double hrs = in.nextDouble();
        int projects = in.nextInt();
        int hrs = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hrs, projects);
    }
}
