package org.example;

public class Main {
    public static void main(String[] args) {

        // математические операторы
        int a = 12;
        int b = 15;
        int c = 3;
        byte Byte1 = 55;
        short Short1 = 32760;
        long Long1 = 549755813888L;
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / c = " + (b / c));
        System.out.println("--a = " + (--a));
        System.out.println("c++ = " + (c++));

        // логические операторы
        if (a>b && a>c) System.out.println("a");
        else if (b>a && b>c) System.out.println("b");
        else System.out.println("c");

        //переполнения при вычислениях
        System.out.println((byte) (Byte1 + 73));
        System.out.println((short) (Byte1 + Short1 + Long1));

        //вычисления комбинаций типов данных (int и double)
        int Int1 = 13;
        double Double1 = 49.5;
        System.out.println("Int1 + Double1: " + (Int1 + Double1));
        System.out.println("Int1 - Double1: " + (Int1 - Double1));
        System.out.println("String " + 10.5+1);
    }
}