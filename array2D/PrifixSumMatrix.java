package array2D;

import java.util.Scanner;

public class PrifixSumMatrix {
    static void sumOfElement(int [][]arr,int l1,int r1,int l2,int r2){

        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of element : "+sum);
    }
    static void sumOfElement1(int [][]arr,int l1,int r1,int l2,int r2){
       

        int sum=0;
        for(int i=l1;i<=l2;i++){
            if(r1>0){
                sum+=(arr[i][r2]-arr[i][r1-1]);
            }
            else{
                sum+=arr[i][r2];
            }
        }
        
        System.out.println("Sum of element : "+sum);
    }
    static void sumOfElement2(int [][]arr,int l1,int r1,int l2,int r2){
        
        int ans=0,sum=0, up=0,left=0,leftup=0;
        sum=arr[l2][r2];

        if(l1>=1 && r1>=1){
        leftup=arr[l1-1][r1-1];
        }
        if(l1>=1){
        up=arr[l1-1][r2];
        }
        if(r1>=1){
            left=arr[l2][r1-1];
            }
        ans=sum-up-left+leftup;
        
       
        
        System.out.println("Sum of element : "+ans);
    }

    //prifix sum of each column element
    static int [][]prifixSumOfColumn(int [][]arr){

        int r=arr.length,c=arr[r-1].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }      
        return arr;
    }
    static int [][]prifixSumOfColumnRow(int [][]arr){
       
        int r=arr.length,c=arr[r-1].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }   
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        //teking input 
        int [][]arr=Dynamic2DArray.tekingInput();
        
        int [][]ans=arr.clone();
        Scanner sc=new Scanner(System.in);
       
        //teking starting index 
        System.out.print("Enter Start Row And column :");
        int l1=sc.nextInt(),r1=sc.nextInt();
       // teking last index
        System.out.print("Enter Start Row And column :");
        int l2=sc.nextInt(),r2=sc.nextInt();
        //print original Array 
        System.out.println("Original Array ");
        Dynamic2DArray.print2DArray(arr);
        //Sum of array element including index statr & end

         sumOfElement(arr, l1,r1,l2,r2); 
         int [][]arr1=prifixSumOfColumn(arr);
         System.out.println("Prifix sum of column ");
         Dynamic2DArray.print2DArray(arr1); 
             
         System.out.println("Sum of element (column0)");
         sumOfElement1(arr1, l1, r1, l2, r2);
         System.out.println("Prifix sum of column And row ");
         int [][]ans1=prifixSumOfColumnRow(ans);
         Dynamic2DArray.print2DArray(ans1);
        System.out.println("Sum of element column And Row ");
        
        sumOfElement2(ans1, l1, r1, l2, r2);

        

        sc.close();
        
    }
    
}
