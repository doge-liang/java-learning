package type;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest {
    public static void main(String[] args) {
        Path p1 = Paths.get(".", "java-learning", "java-learning", "src", "main", "java");
        System.out.println(p1);
        System.out.println(p1.getFileSystem());
        System.out.println(p1.getRoot());
        System.out.println(p1.isAbsolute());
        System.out.println(p1.toFile().exists());
        System.out.println(p1.toAbsolutePath());
        System.out.println(p1.normalize());
        System.out.println(p1.getFileName());

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();

        String sentence = new StringBuilder()
                .append("I ")
                .append("am ")
                .append("a ")
                .append("student.")
                .toString();

        String[] nonEmptyArray = { "these", "can", "change" };
        int[] ints = new int[]{
                1, 2, 3
        };

        String nonEmptyArrayC[] = {"these", "can", "change"};

        Integer a = Integer.MAX_VALUE;
        System.out.println(a ); // 2147483647
        System.out.println(a * 2); // -2

        System.out.println(Integer.MAX_VALUE); // 2147483647, 32位 首位为 0 表示为正
        System.out.println(Integer.MIN_VALUE); // -2147483648, 32位 首位为 1 表示为负数，全为 1 为负数的最小值
        System.out.println(Long.MAX_VALUE); // 9223372036854775807, 64位 首位为0表示为正
        System.out.println(Long.MIN_VALUE); // -9223372036854775808, 64位 首位为0表示为负，全为 1 为负数的最小值
        // float
        // 共计32位，折合4字节
        // 由最高到最低位分别是第31、30、29、……、0位
        // 31位是符号位，1表示该数为负，0反之。
        // 30-23位，一共8位是指数位。
        // 22-0位，一共23位是尾数位
        System.out.println(Float.MAX_VALUE); // 3.4028235E38, 1p128 - 1
        System.out.println(Float.MIN_VALUE); // 1.4E-45, 0x0.000002p-126 1p-149 Float的最小正数
        // double
        // 共计64位，折合8字节
        // 由最高到最低位分别是第63、62、61、……、0位
        // 63位是符号位，1表示该数为负，0反之。
        // 62-52位，一共11位是指数位。
        // 51-0位，一共52位是尾数位
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308, 0x1.fffffffffffffp1023
        System.out.println(Double.MIN_VALUE); // 4.9E-324, 0x0.0000000000001p-1022 1p-1074

    }

    //    常量池
    public static void test1() {
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(10);
        System.out.println(a == b);
    }

    public static void test2() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b);
    }

    //    常量池
    public static void test3() {
        Integer a = Integer.getInteger(String.valueOf(10));
        Integer b = Integer.getInteger(String.valueOf(10));
        System.out.println(a == b);
    }

    //    常量池
    public static void test4() {
        Integer a = Integer.parseInt("10");
        Integer b = Integer.parseInt("10");
        System.out.println(a == b);
    }

    //    常量池
    public static void test5() {
        Integer a = Integer.parseInt("10", 16);
        Integer b = Integer.parseInt("10", 16);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
    }

//    常量池
    public static void test6() {
        Integer a = Integer.decode("0x10");
        Integer b = Integer.decode("0x10");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
    }
}