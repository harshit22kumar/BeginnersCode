package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheNumberOfDublicates {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>(Arrays.asList(156629687, 156629687, 950873097, -816928664, 633452756, 156629687, -816928664, 950873097, 950873097 ));
        solve(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static int solve(final List<Integer> A) {
        Collections.sort(A);
        int count=0;
        int base=A.get(0);
        int freq=0;
        int aIndex=0;
        for(aIndex=1;aIndex<A.size();aIndex++)
        {
            if(base!=(A.get(aIndex))){
                if(freq>0){
                    count=count+freq;
                }
                base=A.get(aIndex);
                freq=0;
            }else{
                freq++;
            }
        }
        return (freq>0)?count+freq:count;
    }
}
