/**
 * Matrix Subtraction
 * Problem Description
 *
 * You are given two integer matrices A and B having same size(Both having same number of rows (N)
 * and columns (M)). You have to subtract matrix A from B and return the resultant matrix.
 * (i.e. return the matrix A - B).
 *
 * If X and Y are two matrices of the same order (same dimensions).
 * Then X - Y is a matrix of the same order as X and Y and its elements are obtained by subtracting
 * the elements of Y from the corresponding elements of X. Thus if Z = [z[i][j]] = X - Y,
 * then [z[i][j]] = [x[i][j]] – [y[i][j]].
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSubtraction {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < ArrayList < Integer > > B = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        B.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6) );
        A.add ( array2 );
        B.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        B.add ( array3 );
        for (ArrayList < Integer > list : solve ( A,B )) {
            System.out.println ( list.toString () );
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> diffMatrix=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> matrix1=A.get(i);
            ArrayList<Integer> matrix2=B.get(i);
            ArrayList<Integer> rowDiff=new ArrayList<>();
            for(int j=0;j<matrix1.size();j++){
                rowDiff.add(matrix1.get(j)-matrix2.get(j));
            }
            diffMatrix.add(rowDiff);
        }
        return diffMatrix;
    }
}
