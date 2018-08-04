import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Weekday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("Illegal day");
            System.exit(-1);
        }

//        String dayType;
//        if (day <= 5) {
//            dayType = "weekday";
//        } else {
//            dayType = "weekend";
//        }
        String dayType = (day <= 5) ? "weekday" : "weekend";

        System.out.println(dayType);
    }
}
