package org.part2;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%3==0){
            ans = "New";
        }
        else if(n%2==0) {
            if (n >= 2 && n <= 5) {
                ans = "Old";
            } else if (n >= 6 && n <= 30) {
                ans = "New";
            } else {
                ans = "Old";
            }
        }
        System.out.println(ans);

    }
}

