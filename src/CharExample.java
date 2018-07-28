/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\n'; // \n, \t, \', \", \\
        char c3 = '\u2615';
        char c4 = 100;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c2 = " + c3);
        System.out.println("c4 = " + c4);

        System.out.println("Hello, ♕");

        // "D:\\"
        System.out.println("\"D:\\\\\"");

        System.out.println("1 $ equals\n" +
                "26.78 UAH\n" +
                "Chart of exchange rate values over time\n" +
                "\n" +
                "1\n" +
                "\n" +
                "\n" +
                "26.78\n" +
                "\n");
    }
}
