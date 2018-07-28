import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneBuying {

    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (yes/no) ");
        boolean isHappy = scanner.next().equals("yes");

        System.out.print("Does girlfriend want? (yes/no) ");
        boolean girlfriendWants = scanner.next().equals("yes");

        if ((!isHappy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Yahooo, I have iPhone :)");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly :(");
        }

        System.out.println("$" + money + " left");
    }
}
