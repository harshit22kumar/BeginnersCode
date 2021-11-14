/*
* Simple Reverse
Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.
* */

package com.company.DSAlgo;

public class SimpleReverse {
    public static void main(String[] args) {
        System.out.println ( solve ( "list" ) );
    }


    public static String solve(String A) {
        int last=A.length()-1;
        int first=0;
        char temp;
        char[] c = A.toCharArray();
        while(first<last){
            temp=c[first];
            c[first]=c[last];
            c[last]=temp;
            first++;
            last--;
        }
        return new String(c);
    }
}
