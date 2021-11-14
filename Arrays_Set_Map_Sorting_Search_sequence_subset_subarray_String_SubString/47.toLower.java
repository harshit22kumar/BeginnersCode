/*
* tolower()
Problem Description

You are given a function to_lower() consisting of a character array A.

Convert each charater of A into lowercase character if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z is converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return the lowercase version of the given character array.



Example Input
Input 1:

 A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
Output 2:

 ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Explanation
Explanation 1:

 All the characters in the returned array are in lowercase alphabets.
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class toLower {
    public static void main(String[] args) {
        ArrayList < Character > list = new ArrayList <> ( Arrays.asList ( 'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y' ) );
        System.out.println ( to_lower ( list ) );
    }


    public static ArrayList<Character> to_lower(ArrayList<Character> A) {
        int toLower;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>=65&&A.get(i)<=90){
                toLower=(int)A.get(i)^32;
                A.set(i,(char)toLower);
            }
        }
        return A;
    }
}
