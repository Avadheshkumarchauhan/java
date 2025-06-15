import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt(),rev=0;
        for(int i=num;i>0;i/=10){
            rev=rev*10+i%10;
            
            //System.out.print(rev);
        }
        System.out.println("Reverse of digit in "+ num+" : "+rev);
        sc.close();
    }
    
}
