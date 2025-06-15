package array1;

import java.util.Scanner;

public class EvanOddPriorityArray {
     static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int []priortyArray(int []arr,int x,int y){
             
        while (x<y) {
            if(arr[x]%2==1 && arr[y]%2==0){

            
            swapArray(arr,x,y);
            x++;
            y--;}
            if(arr[x]%2==0){
                x++;
            }
            if(arr[y]%2==1){
                y--;
            }
            
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
         
         System.out.print("Enter "+s+" even or odd Element : ");
         for(int i=0;i<s;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("WithOut Axtra space priority Array even odd ");
         priortyArray(arr,0,s-1);
         printArray(arr);

         sc.close();
    }
    

    
}
