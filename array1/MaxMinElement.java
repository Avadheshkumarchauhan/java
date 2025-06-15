package array1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinElement {
    //Teking input in Array
     static int  []tekingInput(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Array Size : ");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }sc.close();
        return arr;
        
    }
    //Find max and min element in Array
    static int []maxMin(int []x){
        Arrays.sort(x);
       int []arr1=new int[2];
       arr1[0]=x[0];
       arr1[1]=x[x.length-1];
      
        
        return arr1;
    }

    public static void main(String[] args) {
      int []arr=  tekingInput();
       int []arr1=maxMin(arr);
      System.out.println("Smallest element of Array : "+arr1[0]);
      System.out.println("Largest element of Array : "+arr1[1]);
        
    }
    

    
}
