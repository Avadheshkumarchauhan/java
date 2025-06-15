import java.util.Scanner;

public class number1RaisedTopowernumber2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number : ");
        int num1=sc.nextInt(),num2=sc.nextInt(),power =1;
        for(int i=1;i<=num2;i++){
            power*=num1;
        }
        System.out.println("Power of "+num1+" ^ "+num2+" : "+power) ;
        sc.close();
    }
    
}
