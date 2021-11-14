package com.company.DSAlgo;

import java.util.ArrayList;
/*Find if element of array is consicutive or not*/
import java.util.Arrays;

public class ConsecutiveElement {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        Arrays.sort(list.toArray());
       System.out.println(Arrays.toString(list.toArray()));
    }
    public static int solve(ArrayList<Integer> A) {
        Arrays.sort(A.toArray());
        Integer base=A.get(0);
        int i;
        for(i=1;i<A.size();i++){
            if(A.get(i)!=base+1){
                return 0;
            }
            base=A.get(i);
        }
        return 1;
    }
}
