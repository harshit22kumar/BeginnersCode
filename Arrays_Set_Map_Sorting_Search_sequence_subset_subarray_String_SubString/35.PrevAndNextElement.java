/**
 * Multiplication of previous and next
 * Given an array of integers A, update every element with multiplication of
 * previous and next elements with following exceptions. a) First element is
 * replaced by multiplication of first and second. b) Last element is replaced
 * by multiplication of last and second last.
 *
 *
 * Input Format
 *
 * The only argument given is the integer array A.
 * Output Format
 *
 * Return the updated array.
 * Constraints
 *
 * 1 <= length of the array <= 100000
 * -10^4 <= A[i] <= 10^4
 * For Example
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     [2, 3, 8, 15, 20]
 *
 * Input 2:
 *     A = [5, 17, 100, 11]
 * Output 2:
 *     [85, 500, 187, 1100]
 *
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class PrevAndNextElement {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        solve(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int store=A.get(0);
        int i;
        int currentElement;
        for(i=0;i<A.size()-1;i++){
            currentElement=A.get(i);
            A.set(i,store*A.get(i+1));
            store=currentElement;
        }
        A.set(i,store*A.get(i));
        return A;
    }


}
