package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Transpose {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>>matrix = new ArrayList<>();
        ArrayList<Integer> array=new ArrayList <> (Arrays.asList ( 1,2,3 ));
        matrix.add (array);
        ArrayList<Integer> array2=new ArrayList <> (Arrays.asList ( 1,2,3 ));
        matrix.add ( array2 );
        ArrayList<Integer> array3=new ArrayList <> (Arrays.asList ( 1,2,3 ));
        matrix.add ( array3 );
        System.out.println (  matrix.toString ());
        System.out.println ( solve ( matrix ) .toString ());
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> transapose = new ArrayList();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> list=new ArrayList<> ();
            for(int j=0;j<A.get(i).size();j++){
                int element=A.get(j).get(i);
                list.add ( element );
            }
            transapose.add ( list );
        }
        return transapose;
    }

}
