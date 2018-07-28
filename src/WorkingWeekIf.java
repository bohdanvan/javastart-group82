import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day (1..7): ");
        int day = scanner.nextInt();

        scanner.close();

        // BL
        if (day <= 5) {
            System.out.println("Work");

            if (day >= 4) {
                System.out.println("Swimming Pool");
            }
        } else {
            if (day == 7) {
                System.out.println("Football");
            }

            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
