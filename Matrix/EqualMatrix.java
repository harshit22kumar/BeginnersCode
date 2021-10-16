package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualMatrix {
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
        System.out.println (solve ( A, B )) ;
        }

    public static int solve(ArrayList< ArrayList <Integer> > A, ArrayList<ArrayList<Integer>> B) {
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(i).size();j++){
                if(A.get(i).get(j)!=B.get(i).get(j)){
                    return 0;
                }
            }
        }
        return 1;
    }
}
