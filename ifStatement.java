import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        String st="";
        if (num%2==0){
            st="Even";
        }
        else{
            st="Odd";
        }
        System.out.println("Number is "+st);
        sc.close();
    }
    
}
