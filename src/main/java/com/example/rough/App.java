package com.example.rough;

public class App {
    public static void main(String[] args) {

        // http://stackoverflow.com/questions/10607990/how-should-i-copy-strings-in-java
        // Doesn't create a object. str points to a reference to object "Knowledge"
        String str = "Knowledge";
        // s now holds the reference location of object "Knowledge"
        String s = str;
        // Doesn't replace reference to object. Whereas creates a new reference to object with value "Knowledge base"
        str = str.concat(" base");
        System.out.println(str);
    }
}