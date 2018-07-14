/**
 * @author bvanchuhov
 */
public class PersonInfo {

    public static void main(String[] args) {
        String firstName = "Masha";
        int age = 25;

        firstName = firstName + "123"; // Masha123
        age = age - 10; // 35

        System.out.println("Hello, my name is " + firstName);
        System.out.println("I'm " + age + " years old");
    }
}
