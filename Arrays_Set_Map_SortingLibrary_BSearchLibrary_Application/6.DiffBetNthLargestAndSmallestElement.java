package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiffBetNthLargestAndSmallestElement {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        System.out.println(solve(list,2));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        return A.get(A.size()-B)-A.get(B-1);
    }

}
