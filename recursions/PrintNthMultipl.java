package recursions;

import java.util.Scanner;
class MultipleNumber{
    public void KthMultiple(int n,int k){
        if(k==1){
            System.out.print(n);
            return ;
        }
        KthMultiple(n, k-1);
        System.out.print(" , "+n*k);
    }
}
public class PrintNthMultipl {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter nuber and multiple number : ");
        int num=sc.nextInt(),mul=sc.nextInt();
        System.out.println("---- Multiple number of "+num+"  -----");
        MultipleNumber obj=new MultipleNumber();
        obj.KthMultiple(num, mul);


        sc.close();
    }
    
}
