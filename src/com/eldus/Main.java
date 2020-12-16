package com.eldus;

public class Main {

    public static String centerOfString(String s) {
        String d;
        if (s.length() % 2 == 0) {
            d = String.valueOf(s.charAt(s.length() / 2 - 1)) + String.valueOf(s.charAt(s.length() / 2));
        } else {
            d = String.valueOf(s.charAt(s.length() / 2));
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(centerOfString("abcde"));
        System.out.println(centerOfString("abcd"));


        Bottle a1 = new Bottle(2, 0.4, Color.GREEN, true);
        Bottle a2 = new Bottle(2, 0.4, Color.GREEN, true);
        Bottle a3 = new Bottle(3, 0.4, Color.GREEN, true);
        Bottle a4 = new Bottle(2, 0.5, Color.RED, false);
        Bottle a5 = new Bottle(3, 1, Color.BLUE, false);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a4));
        System.out.println(a1.equals(a5));
    }
}
