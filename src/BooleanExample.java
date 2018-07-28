/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x > 5;

        System.out.println(b3); // true
        System.out.println(x > 20); // false
        System.out.println(x <= 15); // true
        System.out.println(x >= 80); // false
        System.out.println(x == 20); // false
        System.out.println(x != 20); // true
    }
}
