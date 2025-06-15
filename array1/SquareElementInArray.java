package array1;

import java.util.Scanner;

public class SquareElementInArray {
    static void printArray(int []arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void storeSquare(int []arr){
        int n=arr.length;
        int i=0,j=n-1 ,k=0;
        int []ans =new int[n] ;
        while (i<=j) {
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[k++]=arr[j]*arr[j];
                j--;
            }
            
        }


        printArray(ans);
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
        System.out.println("Store square of element in array And print  Accending order ");
        storeSquare(arr);
        sc.close();
     }
    
}
