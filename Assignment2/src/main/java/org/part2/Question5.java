package org.part2;

public class Question5 {
    public static void main(String[] args){
       int i=0;
        for (i=200; i<=3200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                System.out.println("Number is " + i);
            }
        }

    }
}
