import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decibal number : ");
        int decibal=sc.nextInt(),binaryNumber=0,orgdec=decibal,pw=1;
        while (decibal>0) {
            int mod=decibal%2;
            binaryNumber+=(mod*pw);
            pw*=10;
            decibal/=2;
            
        }
        System.out.println("Binary of decimal("+orgdec+") : "+binaryNumber);
        sc.close();
    }
    
}
