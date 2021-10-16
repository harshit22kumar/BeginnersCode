package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class RowSum {

    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        System.out.println (solve(A).toString ());

    }


    public static ArrayList <Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> list= new ArrayList<>();
        for (ArrayList < Integer > integers : A) {
            int sum = 0;
            for (Integer integer : integers) {
                sum = sum + integer;
            }
            list.add ( sum );
        }
        return list;
    }
}
