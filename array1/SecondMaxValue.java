package array1;
import java.util.Scanner;

public class SecondMaxValue {
    static int maxValue(int []arr){

        int max=Integer.MIN_VALUE,n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    static int secondMax(int []arr){
       int max= maxValue(arr);
        int n=arr.length,secMax=0;

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }

        }
        secMax=maxValue(arr);
        if(secMax==Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else{
        return secMax;}


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
        System.out.println("Max value of element of array : "+maxValue(arr));
        int y=secondMax(arr);
        if(y!=Integer.MIN_VALUE){
        
        System.out.println(" Second max value of element of array : "+y);}
        else{
            System.out.println("This is not second max value in Array ");
        }

        sc.close();
    }
}
