import java.util.Scanner;

public class countdigit_basic{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Number : ");
            
        int num1=ob.nextInt(),count=0,sum=0,num=num1, rev=0;
        while(num>0){
            int m=num%10;
            rev*=10;
            rev+=(m);
            sum+=m;
            count++;
            num/=10;
        }
        System.out.println("Reverse of number : "+rev);
        System.out.println("Number of Digit  : "+count);
        System.out.println("Sum of digit : "+sum);

        ob.close();
    }
}