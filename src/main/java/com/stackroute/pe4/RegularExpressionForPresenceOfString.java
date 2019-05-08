/*
A program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False
*/
package com.stackroute.pe4;

import java.util.*;
import java.util.regex.*;

public class RegularExpressionForPresenceOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the string");
        String givenString = in.nextLine();
        System.out.println("enter the pattern string");
        String subString = in.next();

        Pattern pattern = Pattern.compile(subString);//putting substring in pattern instance
        Matcher matcher = pattern.matcher(givenString);

        if (matcher.find())//if the matches are found then print
        {
            System.out.println("Is " + subString + " here ? : " +true);

        }
        else
        {
            System.out.println("Is " + subString + " here ? : " +false);
        }
    }
}
