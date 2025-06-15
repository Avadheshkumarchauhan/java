package recursions;

import java.util.Scanner;
class NumberPow{

    public int numberPow(int p,int q){
        /*
         * TC=O(q)
         * SP=O(q)
         * 
         */
        if(q==0){
            return 1;

        }
        return numberPow(p, q-1)*p;
    }
    public int numberPowBest(int p,int q){
        /*
        Beter solution of code 
        Time Complecity
         * TC=O(log(q))
         * 
         * 
         */
        if(q==0){
            return 1;

        }
        int ans=numberPow(p,q/2);
        if(q%2==0){
            return ans*ans;
        }
        return ans*ans*q;
    }
}

public class PowerOfNumber {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number and power of number : ");
        int num=sc.nextInt(),pow=sc.nextInt();
        NumberPow obj=new NumberPow();
        System.out.println("Power of number ("+num+" ^ "+pow+" ) : "+obj.numberPow(num,pow));
        System.out.println("Power of number ("+num+" ^ "+pow+" ) : "+obj.numberPowBest(num,pow));
    }
    
}
