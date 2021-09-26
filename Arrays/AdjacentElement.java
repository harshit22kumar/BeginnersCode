package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class AdjacentElement {
        public static void main(String []args){
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
           solve(list);
           Arrays.sort(list.toArray());
            System.out.println(Arrays.toString(list.toArray()));
        }

        public static ArrayList<Integer> solve(ArrayList<Integer> A) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<A.size()-1;i++){
                list.add(i,A.get(i+1)-A.get(i));
            }
            return list;
    }
}
