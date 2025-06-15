import java.util.Scanner;

public class condition_basic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Non-even and non-odd : "+num);
        }
       else if(num%2==0){
            System.out.println("Evan number : "+num);
        }
        else{
            System.out.println("Odd number : "+num);
        }
        sc.close();
    }
}
