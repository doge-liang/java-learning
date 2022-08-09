package integer;

public class IntegerTest {
    public static void main(String[] args) {
        Integer num1 = 99;
        Integer num2 = new Integer(99);
        Integer num3 = Integer.valueOf(99);
        int num4 = 99;
        Integer num5 = 128;
        int num6 = 128;
        Integer num7 = Integer.valueOf(128);
        Integer num8 = Integer.parseInt("99");

        System.out.println(num1 == num2); // false
        System.out.println(num1 == num3); // true
        System.out.println(num1 == num4); // true
        System.out.println(num1 == num8); // true
        System.out.println(num5 == num6); // true
        System.out.println(num5 == num7); // false
    }
}
