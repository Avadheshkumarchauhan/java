package array1;

import java.util.Arrays;

public class CopyClone {

    static void printArray(int []x){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int []arr={
            1,4,6,8,0,9,2
        };
        System.out.println("Original Array ");
        printArray(arr);
        int []arr1=arr.clone();
        System.out.println("Copy Array S");
        printArray(arr1);
        arr1[1]=99;
        arr1[2]=88;
        System.out.println(" change of Original Array ");
        printArray(arr);
        
        System.out.println(" change of Copy Array ");
        printArray(arr1);
        //Copy Array
        int []arr2=Arrays.copyOf(arr,arr.length-1);
        System.out.println("Copy Array Range");
        printArray(arr2);
        int []arr3=Arrays.copyOfRange(arr2, 3, 5);
        System.out.println("Array copy of Range ");
        printArray(arr3);
        
    }
    
}
