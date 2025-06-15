package recursions;

import java.util.Scanner;
 class PrintTargetAllIndex{
    public void printTargetAllIndex(int []arr,int j,int target){
        if(j==arr.length){
            return;
        }
        if(arr[j]==target){
            System.out.println(j);
        }
        printTargetAllIndex(arr, j+1, target);
    }
 }

public class PrintTargetIndex {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int []arr=new int[n] ;
        System.out.print("Enter Array of element  "+n+" : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("\n Enter target value : ");
        int target =sc.nextInt();
        // Print ob=new Print();
        // ob.printArray(arr, 0);
        PrintTargetAllIndex obj=new PrintTargetAllIndex();
        System.out.println("---- Array index ----");
       obj.printTargetAllIndex(arr, 0, target);


       sc.close();
    
    }
}

    

