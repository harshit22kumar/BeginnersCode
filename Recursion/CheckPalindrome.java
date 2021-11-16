/**
 * Check Palindrome
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA & get it resolved
 * Get help from TA
 * Problem Description
 *
 * Write a recursive function that checks whether a string A is a palindrome or Not.
 * Return 1 if the string A is palindrome, else return 0.
 *
 * Note: A palindrome is a string that's the same when reads forwards and backwards.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= A <= 50000
 *
 * String A consist only of lowercase letters.
 *
 *
 *
 * Input Format
 *
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 *
 * Return 1 if the string A is palindrome, else return 0.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = "naman"
 * Input 2:
 *
 *  A = "strings"
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  "naman" is a palindomic string, so return 1.
 * Explanation 2:
 *
 *  "strings" is not a palindrome, so return 0.
 *
 *
 * */
package com.company.DSAlgo;

public class CheckPalindrome {
    public int solve(String A) {
        int s=0;
        int e=A.length();
        return checkPalindrome(A,s,e);
    }
    private int checkPalindrome(String str,int s,int e){
        if(s>e){
            return 1;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return 0;
        }
        return checkPalindrome(str,s+1,e-1);
    }
}
