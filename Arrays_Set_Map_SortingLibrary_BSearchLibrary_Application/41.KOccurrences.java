/*
* K Occurrences
Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency K.

He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).

But the sum he ended up getting was huge so he prints it modulo 10^9+7.

In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:

1.   1<=N<=100000
2.   1<=K<=N
3.   0<=H[i]<=10^9
Input: Integers N and K and array of size A

Output: Sum of all numbers in the array that occur exactly K times.

Example:

Input:

N=5 ,K=2 ,A=[1 2 2 3 3]
Output:

5
Explanation:

There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
*
* */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KOccurrences {
    public static void main(String []args){
        System.out.println (getSum(5,2,new ArrayList <> ( Arrays.asList ( 1 ,2 ,2 ,3 ,3 ))));
    }
    public static int getSum(int A, int B, ArrayList<Integer> C) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        long sum=0;
        //there can be tree with hight zero
        boolean occurences=false;
        for(int ele:C){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==B){
                occurences=true;
                sum=sum+entry.getKey();
            }
        }
        if(occurences){
            ans=(int)(sum%1000000007);
        }
        return ans;
    }
}
