import java.util.Scanner;

public class forLoopPrintFectorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fectorial number : ");
        int number=sc.nextInt();
        long fact=1l;
        System.out.print("Factorial : ");
        for(int i=number;i>=1;i--){
            fact=fact*i;
            System.out.print(i+" x ");
        }
        System.out.println("\b\b= "+fact);
        sc.close();
    }
    
}
