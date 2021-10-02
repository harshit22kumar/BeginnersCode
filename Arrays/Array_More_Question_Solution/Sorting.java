/*Given array 0,1 and 2 sort without using sorting algorithm*/
package com.Array.SortArrayWithoutSortingAlgo;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        int[] array=takeInputAsArray();
        /*call method for logic*/
        dutchNationalFlagAlgorithm(array);
        giveOutputAsArray(array);
    }

    private static void dutchNationalFlagAlgorithm(int[] array) {
        int low=0;
        int mid=0;
        int high=array.length-1;
        while(mid<=high){
            switch(array[mid]){
                case 0:{
                    swap_element(array,low,mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                } case 2:{
                    swap_element(array,high,mid);
                    high--;
                    break;
                }
            }
        }
    }

    private static void swap_element(int[] array, int j, int i) {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
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
