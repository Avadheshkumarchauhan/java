import java.util.Scanner;

public class BtoDC {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int bin=ob.nextInt() ,ans=0,s=1;
        while(bin>0){
            int p=bin%10;
            ans+=(p*s);
            bin/=10;
            s*=2;
        }
        System.out.println(ans);
        ob.close();
    }
    
}
