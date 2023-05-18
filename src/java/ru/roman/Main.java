package ru.roman;

public class Main {
    public static void main(String[] args) {
        String name = "aezea";
        System.out.println("строка палиндром? = " + isPalindrome(name));
    }

    public static boolean isPalindrome(String name) {
        String reversed=new StringBuilder(name).reverse().toString();
        return name.equals(reversed);
    }
}
