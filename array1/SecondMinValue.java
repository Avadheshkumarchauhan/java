package array1;
import java.util.Scanner;

public class SecondMinValue {
 
    
    static int minValue(int []arr){

        int min=Integer.MAX_VALUE,n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    static int secondMin(int []arr){
       int min= minValue(arr);
        int n=arr.length,secMin=0;

        for(int i=0;i<n;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }

        }
        secMin=minValue(arr);
        if(secMin==Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else{
        return secMin;
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array size : ");

        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.print("Enter Array "+s+" element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Min value of element of array : "+minValue(arr));
        int y=secondMin(arr);
        if(y!=Integer.MAX_VALUE){
        
        System.out.println(" Second min value of element of array : "+y);
        }
        else{
            System.out.println("This is not Second min value in Array ");
        }

        sc.close();
    }
}

    

