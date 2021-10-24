/*
* Leap year?
Problem Description

Given an integer A representing an year, Return 1 if it is a leap year else return 0.
*
* */

package com.company.DSAlgo;

public class LeapYear {
    public static void main(String []args){
        System.out.println (solve(2020));
    }


    public static int solve(int A) {
        if(A%4==0&&((A%400==0)||(A%100!=0))){
            return 1;
        }
        return 0;
    }
}
