
/*
program to transpose the given string.
 */

package com.stackroute.pe4;
import java.util.Scanner;

public class TransposeTheGivenString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");
        Scanner get = new Scanner(System.in);
        String str = get.nextLine();

        String[] arr = str.split(" ");
        for (String word : arr) {
            StringBuffer sb=new StringBuffer(word);
            System.out.print(sb.reverse()+" ");
        }

    }
}

