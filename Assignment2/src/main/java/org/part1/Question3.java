package org.part1;
import java.util.Scanner;


public class Question3 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        int first = 5;
        int second = 10;

        int Addition = 0;
        System.out.println("Enter two integers: ");
        first = input.nextInt();
        second = input.nextInt();
        Addition = first+second;
        Addition+=30;
        System.out.println("Final Value is "+Addition);
    }


}
