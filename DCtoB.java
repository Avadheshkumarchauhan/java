import java.util.Scanner;

public class DCtoB {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Decimal number : ");
        int dc=ob.nextInt(),ans=0 ,n=1;
        while(dc>0){
            int m=dc%2;
            ans+=(m*n);
            
            dc/=2;
            n*=10;
        }
        System.out.println(ans);

        ob.close();
    }
    
}
