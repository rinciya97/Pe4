/*
a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
 */
package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.*;

public class SortTheStringInAlphabeticalOrder {
    public static void main(String[] args) {

        String str = "Love myself I do. Not everything, but I love the good as well as the bad. I love my crazy lifestyle, and I love my hard discipline. I love my freedom of speech and the way my eyes get dark when I'm tired. I love that I have learned to trust people with my heart, even if it will get broken. I am proud of everything that I am and will become";
        String str1= str.toLowerCase();
        String[] arr = str1.split(" ");

        ArrayList al=new ArrayList();
        for (String word : arr) {
            al.add(word);
        }
        Collections.sort(al);
        Iterator iterator = al.iterator();

        System.out.println("List elements : ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
    }
}
