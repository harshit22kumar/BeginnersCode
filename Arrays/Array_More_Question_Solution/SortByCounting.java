package com.Array.SortArrayWithoutSortingAlgo;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SortByCounting {
    public static void main(String[] args){
        int[] array=takeInputAsArray();
        /*call method for logic*/
        sortByCounting(array);
        giveOutputAsArray(array);
    }

    private static void sortByCounting(int[] array) {
        int no_Of_zero=0;
        int no_Of_two=0;
        int no_Of_one=0;
        for(int i:array){
            if(i==0){
                no_Of_zero++;
            }else if(i==1) {
                no_Of_one++;
            }else {
                no_Of_two++;
            }
        }
        int counter=0;
        for(int i=0;i<no_Of_zero;i++){
            array[counter]=0;
            counter++;
        }
        for(int i=0;i<no_Of_one;i++){
            array[counter]=1;
            counter++;
        }
        for(int i=0;i<no_Of_two;i++){
            array[counter]=2;
            counter++;
        }
    }
    public static int[] takeInputAsArray(){
        System.out.println("Enter the size of array");
        int size;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }
    public static void giveOutputAsArray(int @NotNull [] array){
        System.out.println("Element of array are");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
