package array1;
import java.util.Scanner;

public class ArrayReverse {
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
    static void reverseArray(int []arr){
        int n=arr.length;
     
        
        int i=0;
        int j=n-1;
        while(i<j){
           swapArray(arr, i, j);
            
            /*//OR
            int t=0;
            t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            */
            i++;
            j--;
        }
        printArray(arr);
        
    }
    static void  reverseArrayWithVar(int []arr){
        int n=arr.length;
        int []ans=new int[n];
        int i=0;
        
        
        for(int j=n-1;j>=0;j--){
           ans[i]=arr[j];
            
            i++;
        
        }
        printArray(ans);
        
    }
    static void swapArray(int []arr,int i,int j){
        int t=0;
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String[] args) {
        int []arr=TekingInput();
        int []arr1=arr.clone();
        System.out.println("Reverse array without variable ");
       reverseArray(arr);
        System.out.println("Reverse Array with variable ");
       
        reverseArrayWithVar(arr1);
        
        
        
    }
    
}
