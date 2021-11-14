/*Common Elements
Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.


* */


package com.company.DSAlgo;
//can also be done using hashSet
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonElements {
    public static void main(String []args){
        System.out.println (
                solve(new ArrayList <> ( Arrays.asList ( 2, 1, 4, 10 )),
                        new ArrayList <> ( Arrays.asList ( 3, 6, 2, 10, 10 ))).toString ());
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int i=0;int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<A.size()&&j<B.size()){
            if(A.get(i).equals (B.get(j))){
                list.add(A.get(i));
                i++;j++;
            }else if(A.get(i)<B.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return list;
    }
}
