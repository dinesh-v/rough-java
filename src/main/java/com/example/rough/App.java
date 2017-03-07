package com.example.rough;

public class App {
    public static void main(String[] args) {
        int x = 10;
        add(x);
        System.out.println(x);
        Integer integer = 10;
        add(integer);
        System.out.println(integer);
        int[] intArray = new int[1];
        intArray[0] = 10;
        add(intArray);
        System.out.println(intArray[0]);

    }

    private static void add(int x) {
        x += 10;
    }

    private static void add(Integer x) {
        x += 10;
    }

    private static void add(int... intArray) {
        intArray[0] += 10;
    }

}
