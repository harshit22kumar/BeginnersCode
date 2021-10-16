/*
* Noble Integer
Problem Description

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.



Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is found else return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array. So, return 1.
Explanation 2:

 There is no such integer exists.
*
*
*
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobelInt {
    public static void main(String[] args){
        ArrayList<Integer> list=new
                ArrayList <> ( Arrays.asList ( 1,3,5,6,7,33,0 ) );
        System.out.println (solve(list));
    }
    public static int solve(ArrayList <Integer> A) {
        Collections.sort(A);
        int ans=-1;
        int count=0;
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i+1)!=A.get(i)){
                if(A.get(i)==A.size()-1-i){
                    count++;
                }
            }
        }
        if((count>0)&&(A.get(A.size()-1)==0)){
            ans=1;
        }
        return ans;
    }
}
