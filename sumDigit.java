import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=sc.nextInt(),sum=0;
        int num=number;
        while(number>0){
            sum+=number%10;
            number/=10;
            
        
        }
        System.out.println("Sum of digits in "+num+" : "+sum) ;
        sc.close();
    }
    
}
