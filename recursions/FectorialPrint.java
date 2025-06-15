package recursions;

import java.util.Scanner;

class Fectorial{
    /*
     * TC=O(n)
     * SP=O(n)
     */
    public long fectPrint(int n){
        if(n==0){
            System.out.print("\b\b= ");
            return 1;
        }
        System.out.print(n+" X ");
        return n*fectPrint(n-1);
    }
}
public class FectorialPrint {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter fectorial number : ");
        int num =sc.nextInt();
        Fectorial obj=new Fectorial();
        System.out.print("Fectorial of "+num+": ");
        System.out.println(obj.fectPrint(num));

        sc.close();
    }
    
}
