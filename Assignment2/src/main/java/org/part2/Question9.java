package org.part2;
import java.util.Scanner;

public class Question9 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in); //Create an object for Scanner class.
        String actualValue="random";
        System.out.println("Enter Char array length: ");


        char c[] = actualValue.toCharArray();//Create char array with given length
        boolean foundAnswer=false;
        String temp=null;
        temp=s.next();
        int len;

        for (int i=0;i<c.length;i++)

        {




                if(c[i]==temp.charAt(0)) {
                    foundAnswer = true;
                    System.out.println("Found");
                     if(foundAnswer)
                         break;
                }



           

        }
        if(!foundAnswer)
            System.out.println("Not found");

    }

} //End…….!


