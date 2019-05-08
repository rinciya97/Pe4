

/*
a java program to count the total number of occurrences of a given character in a string
without using any loop
*/


package com.stackroute.pe4;

public class TotalNumOfOccuranceOfACharacter {
    public static void main(String[] args) {
        String str = "java is java again java again";
        int charcount = str.length() - str.replaceAll("j", "").length();
        System.out.println("Occurrence of a char in given String: " + charcount);

    }
}
