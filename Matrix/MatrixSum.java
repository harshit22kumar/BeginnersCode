/**
 * Add the matrices
 * Problem Description
 *
 * You are given two matrices A & B of same size,
 * you have to return another matrix which is the sum of A and B.
 *
 * */

package com.company.DSAlgo;


import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSum {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < ArrayList < Integer > > B = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        B.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        B.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        B.add ( array3 );
        for (ArrayList < Integer > list : solve ( A, B )) {
            System.out.println ( list.toString () );
        }
    }


    public static ArrayList< ArrayList <Integer> > solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> sumMatrix=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> matrix1=A.get(i);
            ArrayList<Integer> matrix2=B.get(i);
            ArrayList<Integer> rowSum=new ArrayList<>();
            for(int j=0;j<matrix1.size();j++){
                rowSum.add(matrix1.get(j)+matrix2.get(j));
            }
            sumMatrix.add(rowSum);
        }
        return sumMatrix;
    }

}
