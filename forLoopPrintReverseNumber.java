import java.util.Scanner;

public class forLoopPrintReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1 to n : ");
        int number=sc.nextInt();
        for (int num=number;num>=1;num--){
            System.out.println(num);
        }
        
        sc.close();
    }
    
}
