/*
* Check Palindrome!
Problem Description

Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
*
* */


package com.company.DSAlgo;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public static void main(String []args){
       System.out.println (solve("aaeeaaeef"));
    }

    public static int solve(String A){
        int oddCount=0;
        int ans=1;
        HashMap <Character,Integer> map=new HashMap ();
        for(int i=0;i<A.length();i++){
            if(map.containsKey ( A.charAt ( i ) )){
                map.put(A.charAt ( i ),map.get (A.charAt(i))+1);
            }else{
                map.put(A.charAt ( i ),1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue ()%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
           ans=0;
        }
        return ans;
    }
}
