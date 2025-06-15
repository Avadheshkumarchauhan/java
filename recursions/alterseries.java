package recursions;
import java.util.Scanner;

public class alterseries {
    public static int series(int n){
        if (n<1){
            return n;
        }
        else{
            if(n%2==0){
                return series(n-1)-n;
            }
            else{
                return series(n-1)+n;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int x=sc.nextInt();
        System.out.println("Sum of alter series : "+series(x));
        sc.close();
    }
    
}
