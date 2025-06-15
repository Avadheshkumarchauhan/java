package array1;

import java.util.Scanner;

public class SufixSumOfArray {
     static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sufixSumExtraSpace(int []arr){
        int n=arr.length;
        int []priSum=new int[n];
        priSum[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            priSum[i]=priSum[i+1]+arr[i];
        }
        printArray(priSum);
    }
    static void sufixSumNoExtraSpace(int []arr){
        int n=arr.length;
    
        for (int i=n-2;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.print("Enter "+s+" Element ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Sufix sum of  element ");
        sufixSumExtraSpace(arr);
        System.out.println("sufix sum of  element ");
        sufixSumNoExtraSpace(arr);
        sc.close();
        
    }
    

    
}
