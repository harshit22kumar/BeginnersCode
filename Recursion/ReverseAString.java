/*
* Print reverse string
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA
Problem Description

Write a recursive function that, given a string S, prints the characters of S in reverse order.



Problem Constraints

1 <= |s| <= 1000



Input Format

First line of input contains a string S.



Output Format

Print the character of the string S in reverse order.



Example Input

Input 1:

 scaleracademy
Input 2:

 cool


Example Output

Output 1:

 ymedacarelacs
Output 2:

 looc


Example Explanation

Explanation 1:

 Print the reverse of the string in a single line.
*
*
* */


package com.company.DSAlgo;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char[] chr=str.toCharArray();
        int s=0;int e=chr.length-1;
        System.out.println(new String(reverse(chr,s,e)));

    }

    private static char[] reverse(char []chr,int s,int e){
        if(s>=e){
            return chr;
        }else{
            char ch=chr[s];
            chr[s]=chr[e];
            chr[e]=ch;
        }
        return reverse(chr,s+1,e-1);
    }
}
