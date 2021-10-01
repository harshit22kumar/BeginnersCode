package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IfArrayCanBeArrangedInAP {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( solve ( list ) );
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        Integer comDiff=A.get(1)-A.get(0);
        for(int i=1;i<A.size()-1;i++){
            if(A.get(i+1)-A.get(i)!=comDiff){
                return 0;
            }
        }
        return 1;
    }
}
