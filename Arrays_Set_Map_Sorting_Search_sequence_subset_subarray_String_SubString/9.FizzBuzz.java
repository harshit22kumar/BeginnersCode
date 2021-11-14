/**
 * FizzBuzz
 * Problem Description
 *
 * Given a positive integer A, return an array of strings with all the
 * integers from 1 to N. But for multiples of 3 the array should have “Fizz”
 * instead of the number. For the multiples of 5, the array should have “Buzz”
 * instead of the number. For numbers which are multiple of 3 and 5 both, the
 * array should have "FizzBuzz" instead of the number.
 *
 * Look at the example for more details.
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String []args){
        ArrayList<String> list=fizzBuzz(15);
        System.out.println(list.toString());
    }
        public static ArrayList<String> fizzBuzz(int A) {
            ArrayList<String> list=new ArrayList<>();
            for(int i=1;i<=A;i++){
                if(i%3==0 && i%5==0){
                    list.add("FizzBuzz");
                } else if(i%3==0){
                    list.add("Fizz");
                } else if(i%5==0){
                    list.add("Buzz");
                } else {
                    list.add(Integer.toString(i));
                }
            }
            return list;
        }
}
