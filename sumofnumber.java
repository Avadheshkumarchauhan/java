import java.util.Scanner;

public class sumofnumber {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int sum=0;
    System.out.print("Enter first number :  ");
    int number1=sc.nextInt();
    System.out.print("Enter second number : ");
    int number2=sc.nextInt();
    sum=number1+number2;
    System.out.println("sum = "+sum);
    sc.close();
}    
}
