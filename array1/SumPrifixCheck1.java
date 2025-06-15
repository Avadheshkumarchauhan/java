package array1;

import java.util.Scanner;

public class SumPrifixCheck1 {
     static int [] prifixSumNoExtraSpace(int []arr){
        int n=arr.length;
    
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
       
    }
    static int sumTotal(int []arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
       
        return total;
    }
    static void  checkSum(int []arr , int total){
      boolean flg=false;
       
        for(int i=0;i<arr.length;i++){
            
            int sufix=total-arr[i];
            if(sufix  == arr[i]){
             flg=true;
        }
      }
        System.out.println("Equal position  "+ flg);
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
        
        int t=sumTotal(arr);
       
       int []ans= prifixSumNoExtraSpace(arr);
       checkSum(ans, t);

      
        sc.close();
        
    }
    

    

    
}
