package array1;

import java.util.Scanner;

public class SearchPriority {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int []priortyArray(int []arr,int x,int y){
             
        while (x<y) {
            if(arr[x]==1 && arr[y]==0){

            
            swapArray(arr,x,y);
            x++;
            y--;}
            if(arr[x]==0){
                x++;
            }
            if(arr[y]==1){
                y--;
            }
            
        }
        return arr;

    }
    static void priority(int arr[]){
        int n=arr.length,c=0,j=0;
        int []ans=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c++;
            }
        }
        for(int i=0;i<c;i++){
            ans[j++]=0;
        }
        for(int i=c;i<n;i++){
            ans[j++]=1;
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
          Scanner sc =new Scanner(System.in);

         System.out.print("Enter Array size : ");
         int s=sc.nextInt();
         int []arr=new int[s];
     
         
         System.out.print("Enter "+s+" Element : ");
         for(int i=0;i<s;i++){
             arr[i]=sc.nextInt();
         }
         int []arr1=arr.clone();
         System.out.println("WithOut Axtra space priority Array ");
         priortyArray(arr,0,s-1);

         printArray(arr);
         System.out.println("Wiht Axtra space priority array ");
         priority(arr1);

         sc.close();
    }
    
}
