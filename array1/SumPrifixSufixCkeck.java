package array1;

import java.util.Scanner;

public class SumPrifixSufixCkeck {
       
    static int sumTotal(int []arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
       
        return total;
    }
    static boolean  checkSum(int []arr ){
       int prifix=0;
       int total=sumTotal(arr);
        for(int i=0;i<arr.length;i++){
            prifix+=arr[i];
            int sufix=total-prifix;
            if(sufix  == prifix){
                return true;

        }
      }
        return false;

      
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
        
       
       
       
       System.out.println("Equal position : "+checkSum(arr));
      

      
        sc.close();
        
    }
    

    
}
