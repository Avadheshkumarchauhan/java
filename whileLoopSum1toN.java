import java.util.Scanner;

public class whileLoopSum1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num=1,number=sc.nextInt(),sum=0;
        while(num<=number){
            sum+=num;
            num++; 
        }
        System.out.println("sum of 1 to "+number+" : "+sum);
        sc.close();
    }
    
}
