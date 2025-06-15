import java.util.Scanner;

public class gcd_code {
    public static int gcd(int m,int n){
        while(m%n!=0){
            int r=m%n;
            m=n;
            n=r;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two HCF number : ");
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("HCF : "+gcd(x,y));
        sc.close();
    }
    
}
