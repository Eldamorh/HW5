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

//    public static String stringInventer1(String s) {
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isLetter(chars[i])) {
//                if (Character.isLowerCase(chars[i])) {
//                    chars[i] = Character.toUpperCase(chars[i]);
//                } else {
//                    chars[i] = Character.toLowerCase(chars[i]);
//                }
//            }
//            stringBuilder.append(chars[i]);
//        }
//        return stringBuilder.toString();
//    }

    public static String stringInventer(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (Character.isLowerCase(s.charAt(i))) {
                    stringBuilder.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    stringBuilder.append(Character.toLowerCase(s.charAt(i)));
                }
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String stringBlaBlaBla(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        if (s.length() % 2 == 0) {
            stringBuilder.append(s.substring(s.length()/2));
            stringBuilder.append(s.substring(0,s.length()/2));
        }
        else{
            stringBuilder.append(s.substring(s.length()/2+1));
            stringBuilder.append(s.charAt(s.length()/2));
            stringBuilder.append(s.substring(0,s.length()/2));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(centerOfString("abcde"));
        System.out.println(centerOfString("abcd"));

        System.out.println(stringInventer("AbCd[]kK"));

        System.out.println(stringBlaBlaBla("AbCd"));
        System.out.println(stringBlaBlaBla("AbCdE"));

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
