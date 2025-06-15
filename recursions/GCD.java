package recursions;
import java.util.Scanner;

public class GCD {
    public static int gcd(int m,int n){

        if(n<1){
            return m;

        }
        else{
            return gcd(n,m%n);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two HCF number : ");
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("HCF : "+gcd(x,y));
        sc.close();
    }
    
}
