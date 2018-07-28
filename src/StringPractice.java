/**
 * @author bvanchuhov
 */
public class StringPractice {

    public static void main(String[] args) {
        String s = "Hi, Java";

        // 1
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        // 2
        int index = s.indexOf(",");
        System.out.println(index); // 5

        // 3
        boolean startsWithHello = s.startsWith("Hello");
        System.out.println(startsWithHello);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
