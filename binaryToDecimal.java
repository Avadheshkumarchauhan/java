import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter binary number(0,1) form : ");
        int binaryNumber=sc.nextInt(),pw=1,decimal=0,orgbin=binaryNumber;
        while (binaryNumber>0) {
            int mod=binaryNumber%10;
            decimal+=(mod*pw);
            pw*=2;
            binaryNumber/=10;
            
        }
        System.out.println("Decimal of binary ("+orgbin+") : "+decimal);
        sc.close();
    }
    
}
