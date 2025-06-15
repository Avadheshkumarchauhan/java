package recursions;
import java.util.Scanner;

public class multiply_using_rec{
    public static int mul(int m,int n){
        if (n<1){
            return 0;
        }
        else{
            return m+ mul(m, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number : ");
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("multiply : "+mul(x,y));
        sc.close();
    }
}