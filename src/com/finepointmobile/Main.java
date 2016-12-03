package com.finepointmobile;

import java.util.ArrayList;

public class Main {

    private static String theString = "aabaaaaaaaabaasdfdoiywsgsweoriwgwg";

    private static ArrayList<String> alreadyHas;

    private static ArrayList<String> duplicates;

    public static void main(String[] args) {

        alreadyHas = new ArrayList<>();
        duplicates = new ArrayList<>();

        for (int i = 0; i < theString.length(); i++) {

            if (alreadyHas.contains(theString.charAt(i) + "")) {
                addToDuplicates(theString.charAt(i) + "");
            }
            alreadyHas.add(theString.charAt(i) + "");
        }

    }

    private static void addToDuplicates(String s) {
        if (!duplicates.contains(s)) {
            System.out.println(s + " is a duplicate");
            duplicates.add(s);
        }
    }

}
