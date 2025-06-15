package recursions;

import java.util.Scanner;

class Count{
    /*
     * TC=O(n)
     * SP=O(n)
     */
    public int countDigit(int n){
        if(n>=0 &&n<=9){
            return 1;
        }
        return countDigit(n/10)+1;
    }
}
public class CountOfDigitNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        Count obj =new Count();

        System.out.println("Number of digit ("+num+") : "+obj.countDigit(num) );
        sc.close();
    }
    
}
