/*
a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
 */
package com.stackroute.pe4;

import java.util.regex.*;

public class MultipleOccuranceUsingMatcher {
    public static void main(String[] args) {

        String text    ="She sells seashells by the seashore";
        String patternString = "se";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }
}
