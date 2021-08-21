package org.part2;

import java.util.Scanner;

public class Question4 {
    public static void main(String args[]){

        int n;
                while(true) {
                    System.out.println("Enter a number greater than 1: ");
                    Scanner s = new Scanner(System.in);
                    n = s.nextInt();
                    if (n < 0) {
                        System.out.println("It is Over");
                        break;
                    } else
                    {
                        System.out.println("Good going");
                        continue;
                    }
                }

            }


    }



