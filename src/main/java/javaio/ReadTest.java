package javaio;

import java.io.FileNotFoundException;

public class ReadTest {
    public static void main(String[] args) throws FileNotFoundException {
        char eof = (char) 0xFFFF;
        byte beof = (byte) 0xFF;
        System.out.println(eof == -1);
        System.out.println(beof == -1);
    }
}