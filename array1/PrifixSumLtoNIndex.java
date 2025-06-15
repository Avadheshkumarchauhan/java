package array1;

import java.util.Scanner;

public class PrifixSumLtoNIndex {
     static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    static int[] prifixSumNoExtraSpace(int []arr){
        int n=arr.length;
    
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
  
    static void prifixSumIdex(int []arr,int st,int end){

        int total=arr[end]-arr[st-1];

        System.out.println("sum : "+total);


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int s=sc.nextInt();
        int []arr=new int[s+1];
        System.out.print("Enter "+s+" Element ");
        for(int i=1;i<=s;i++){
            arr[i]=sc.nextInt();
        }
        int q=1;
         int []arr1=prifixSumNoExtraSpace(arr);
         while(q!=0){
         System.out.print("Enter range star and end ");
         int st=sc.nextInt(),end=sc.nextInt();
         System.out.println("Sum of Array index "+st+" to "+end+": ");
         prifixSumIdex(arr1, st, end);
         System.out.print("Query continu (1) or break (0): ");
         q=sc.nextInt();
         }
        
        sc.close();
        
    }
    

    
}
