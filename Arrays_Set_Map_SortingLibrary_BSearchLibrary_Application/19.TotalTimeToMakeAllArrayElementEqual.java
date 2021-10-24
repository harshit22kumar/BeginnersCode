/**
 * Time to equality
 *
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class TotalTimeToMakeAllArrayElementEqual {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        System.out.println(solve(list));
    }
    public static int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        for(int ele:A){
            if(ele>max){
                max=ele;
            }
        }
        int totalTime=0;
        for(int ele:A){
            totalTime+=Math.abs(ele-max);
        }
        return totalTime;
    }
}
