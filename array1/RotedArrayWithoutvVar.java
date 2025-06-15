package array1;

import java.util.Scanner;

public class RotedArrayWithoutvVar {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int []reverseArray(int []arr,int x,int y){
             
        while (x<y) {
            swapArray(arr,x,y);
            x++;
            y--;
            
        }
        return arr;

    }
    static void swapArray(int []arr,int i,int j){
        int t=0;
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String[] args) {
        
          Scanner sc =new Scanner(System.in);

         System.out.print("Enter Array size : ");
         int s=sc.nextInt();
         int []arr=new int[s];
         
         System.out.print("Enter "+s+" Element : ");
         for(int i=0;i<s;i++){
             arr[i]=sc.nextInt();
         }
         System.out.print("Enter rotate value  : ");
         int r =sc.nextInt();
         r%=s;
         int []arr1=arr.clone();
         reverseArray(arr, s-r,s-1);
         reverseArray(arr, 0, s-r-1);
         reverseArray(arr, 0, s-1);
         System.out.println("Roted Array Right to left ");
         printArray(arr);
         
         reverseArray(arr1, r,s-1);
         reverseArray(arr1, 0, r-1);
         reverseArray(arr1, 0, s-1);
         System.out.println("Roted Array left to right ");
         printArray(arr1);
 
        
        sc.close();
    }
    
}
