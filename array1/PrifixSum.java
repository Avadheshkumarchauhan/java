package array1;

import java.util.Scanner;

public class PrifixSum {

    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void prifixSumExtraSpace(int []arr){
        int n=arr.length;
        int []priSum=new int[n];
        priSum[0]=arr[0];
        for (int i=1;i<n;i++){
            priSum[i]=priSum[i-1]+arr[i];
        }
        printArray(priSum);
    }
    static void prifixSumNoExtraSpace(int []arr){
        int n=arr.length;
    
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
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
        
        System.out.println("Prifix sum of  element ");
        prifixSumExtraSpace(arr);
        System.out.println("Prifix sum of  element ");
        prifixSumNoExtraSpace(arr);
        sc.close();
        
    }
    
}
