/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitive types (8)

        // 1. Integer numbers (4)
        byte b = 100; // 1B, 256, -128...127 // <----
        short s = 10000; // 2B, max = 32000
        int x = 1000000000; // 4B, max = 2 000 000 000 // <----
        long l = 1000000000000000000L; // 8B, max = 1 000 000 000 000 000 000

        // 2. Floating point (2)
        float f = 10.5f; // 4B
        double d = 10.5; // 8B

        // 3. Character (1)
        char c = 'a';

        // 4. Logical
        boolean bool = false;

        // Object types
        String str = "Java";
    }
}
