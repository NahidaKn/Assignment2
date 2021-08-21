package org.part1;

public class Question1Part2 {
    public static void main(String[] args) {
        //Swap two numbers using the third variable as a result name

        int a, b, temp;
        a = 27;
        b = 15;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
