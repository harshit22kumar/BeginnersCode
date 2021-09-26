package com.company.DSAlgo;

import java.util.Scanner;

public class AbsoluteDiffBetweenEvenAndOddCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T>0){
            int size=in.nextInt();
            int[] arr=new int[100000];
            for(int i=0;i<size;i++)
            {
                arr[i]=in.nextInt();
            }
            int evenCount=0;
            int oddCount=0;
            for(int i=0;i<size;i++){
                if(arr[i]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            System.out.println(Math.abs(evenCount-oddCount));
            T--;
        }
    }
}
