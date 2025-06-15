package recursions;

import java.util.Scanner;
class Febonacci{
    /*
     * TC=O(2^n)
     * SP=O(n)
     */
    public int febonacciNumber(int n){
if(n==0||n==1){
    return n;
}

        return febonacciNumber(n-1)+febonacciNumber(n-2);
    }
}

public class FebonacciNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter febonacci number: ");
        int num=sc.nextInt();
        Febonacci obj=new Febonacci();
        System.out.print("Febonacci series of "+num+" : ");
        for(int i=0;i<=num;i++){
            if(i>0){
                
                System.out.print(",");
            }
            System.out.print(obj.febonacciNumber(i));
          
        }

        sc.close();
    }
    
}
