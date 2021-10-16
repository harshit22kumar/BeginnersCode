package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDiagonal {
    public static void main(String []args) {
        List < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        System.out.println (solve(A));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int solve(final List <ArrayList<Integer>> A) {
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum=sum+A.get(i).get(i);
        }
        return sum;
    }
}
