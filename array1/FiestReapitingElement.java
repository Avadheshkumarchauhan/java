package array1;
import java.util.Scanner;

public class FiestReapitingElement {
    static int firstReapiting(int []arr){

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
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
        int x=firstReapiting(arr);

        if(x!=-Integer.MIN_VALUE){
        System.out.println("Find reapiting value : "+x);
        }
        else{
            System.out.println("This is Not reapiting Value in Array ");
        }

        sc.close();
    }
    

    
}
