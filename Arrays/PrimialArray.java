/**
 * Primal Power
 * Problem Description
 *
 * "Primal Power" of an array is defined as the count of prime numbers present in it.
 *
 * Given an array of integers A of length N, you have to calculate its Primal Power.
 *
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimialArray {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(list));
    }

    public static int solve(ArrayList<Integer> A) {
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>0 && checkPrime(A.get(i))){
                count++;
            }
        }
        return count;
    }

    public static boolean checkPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }



}
