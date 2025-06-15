package recursions;

import java.util.Scanner;

class Sum{
    /*
     * TC=O(n)
     * SP=O(n)
     */
    public int sumOfDigit(int n){
        if(n>0&&n<=9)
        return n;
        
        return n%10+sumOfDigit(n/10);
    }
}

public class SumOfDigitNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        
        int num=sc.nextInt();
        Sum obj=new Sum();
        System.out.println("Sum of digit ("+num+") : "+obj.sumOfDigit(num));

        sc.close();
    }
    
}
