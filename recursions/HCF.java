package recursions;

import java.util.Scanner;
class IHCF{
    public int iHCF(int x,int y){

        while (x%y!=0) {
            
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
}
class GCD1{
    public int gCD1(int x,int y){
        if(y==0)return x;
        return gCD1(y,x%y);
    }
}
class LCM{
    public int lCM(int m,int n){
        GCD1 obj2=new GCD1();
        int x=obj2.gCD1(m, n);

        return m*n/x;
    }
}
public class HCF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number : ");
        int x=sc.nextInt(),y=sc.nextInt();
        IHCF obj=new IHCF();
        System.out.println("HCF of "+x +" And "+y+" : "+obj.iHCF(x,y));
        GCD1 obj1=new GCD1();
        System.out.println("HCF of "+x +" And "+y+" : "+obj1.gCD1(x,y));
        LCM obj3=new LCM();
        System.out.println("LCM of "+x +" And "+y+" : "+obj3.lCM(x,y));


        sc.close();
    }
    
}
