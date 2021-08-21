package org.part1;

public class Question1 {
    public static void main(String[] args) {
        //Swap two numbers using the third variable as a result name

        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
