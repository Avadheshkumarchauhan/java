package recursions;
import java.util.Scanner;

public class fectorial {
    static long fectorials(int n){
        if(n<1) {
          System.out.print("\b\b= ");
          return 1;
         }else{
            System.out.print(n+" X ");
            return n* fectorials(n-1);
      /* 
        // OR .....
          int x=fectorials(n-1);
          int ans=n*x;
          return ans;
      */
         } 
    }  
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter fectorial number: ");
        int n =sc.nextInt();
        System.out.print( "fectorial of "+n+" : ");
        System.out.println(fectorials(n));

        sc.close();
    }
}
