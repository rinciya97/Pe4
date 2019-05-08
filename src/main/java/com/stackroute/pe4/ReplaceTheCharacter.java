

/*replace all d with f and all l with t in strings
*/


package com.stackroute.pe4;


import java.util.Scanner;

public class ReplaceTheCharacter {
    public static void main(String[] args)
    {
        System.out.println("Input String:");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.replace("d","f").replace("l","t");
        System.out.println("Original String:"+str);
        System.out.println("New String:"+ str1);

    }
}
