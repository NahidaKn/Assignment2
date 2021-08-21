package org.part2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int value = 4;
        int firstNumber,secondNumber,avg1,avg2;
        int result=0;
        System.out.println("Enter operation");
        value=sc.nextInt();
        String valueString;
        System.out.println("Enter First Number");
        firstNumber=sc.nextInt();
        // switch statement with int data typePart4
        System.out.println("Enter Second Number");

        secondNumber=sc.nextInt();
        switch (value) {
            case 1:
                result=firstNumber+secondNumber;
                System.out.println("Addition of two Number"+result);
                break;
            case 2:
                result=firstNumber-secondNumber;
                System.out.println("Substraction of two Number"+result);
                break;
            case 3:
                result=firstNumber/secondNumber;
                System.out.println("Division of two Number"+result);
                break;
            case 4:
                result=firstNumber*secondNumber;
                System.out.println("Multiplication of two Number"+result);
                break;
            case 5:
                System.out.println("Enter two more numbers for average");
                avg1=sc.nextInt();
                avg2=sc.nextInt();
                result=firstNumber+secondNumber+avg1+avg2/4;
                System.out.println("Avergae of four numbers"+result);
                break;
            default:
                valueString = "Invalid value";
                break;
                }
           if(result<0)
               System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number”");
        }

    }


