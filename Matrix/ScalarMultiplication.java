package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalarMultiplication {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        System.out.println (solve (A,3));
    }
    public static ArrayList< ArrayList <Integer> > solve(ArrayList<ArrayList<Integer>> A, int B) {
        for (ArrayList < Integer > integers : A) {
            for (int j = 0; j < integers.size (); j++)
                integers.set ( j, integers.get ( j ) * B );
        }
        return A;
    }
}
