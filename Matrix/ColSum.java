/**
 * Column Sum
 * Problem Description
 *
 * You are given a 2D integer matrix A,
 * return a 1D integer vector containing column-wise sums of original matrix.
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class ColSum {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        solve ( A ).stream ().map ( Object::toString ).forEach ( System.out::println );
    }
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<A.get(0).size();i++){
            int sum=0;
            int siz=A.size();
            for(int j=0;j<siz;j++){
                sum=sum+A.get(j).get(i);
            }
            list.add(sum);
        }
        return list;
    }
}
