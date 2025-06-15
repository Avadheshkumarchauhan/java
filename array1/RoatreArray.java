package array1;

import java.util.Scanner;

public class RoatreArray {
        static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int []TekingInput(){
        Scanner sc =new Scanner(System.in);

         System.out.print("Enter Array size : ");
         int s=sc.nextInt();
         int []arr=new int[s];
         
         System.out.print("Enter "+s+" Element : ");
         for(int i=0;i<s;i++){
             arr[i]=sc.nextInt();
         }
        
        sc.close();
        return arr;
    }
    static  void rotateLeft(int []arr,int r){
        int l=arr.length ,j=0;
        int []ans=new int[l];
        for(int i= l-r;i<l;i++){
            ans[j++]=arr[i];
        }
     
        
        for(int i= 0;i<l-r;i++){
            ans[j++]=arr[i];
        }


        printArray(ans);

    }
    static  void rotateRight(int []arr,int r){
        int l=arr.length ,j=0;
        int []ans=new int[l];
       
      
        for(int i= r;i<l;i++){
            ans[j++]=arr[i];
        }
        for(int i= 0;i<r;i++){
            ans[j++]=arr[i];
        }
        printArray(ans);

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rotate value  : ");
        int r =sc.nextInt();

        int []arr=TekingInput();
        int l=arr.length;
        r=r%l;
        System.out.println("Roted left of Array of Element ");
        rotateLeft(arr, r);
        int []arr1=arr.clone();
        System.out.println("Roted right of Array of Element ");
        rotateRight(arr1, r);
        sc.close();
        
    }
    
}