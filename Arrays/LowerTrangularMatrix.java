package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerTrangularMatrix {
    public static void main(String []args){
        List<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(2,1,0)));
        matrix.add(new ArrayList<>(Arrays.asList(3,-2,1)));
        LowerTrangularMatrix ltm=new LowerTrangularMatrix();
        System.out.println(ltm.solve(matrix));
    }

    public int solve(final List<ArrayList<Integer>> A) {
        for(int row=0;row<A.size();row++){
            final ArrayList<Integer> rowArray=A.get(row);
            for(int col=0;col<rowArray.size();col++){
                int ele=rowArray.get(col);
                if(col>row && ele!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
}
