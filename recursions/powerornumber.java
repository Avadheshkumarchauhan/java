package recursions;
import java.util.Scanner;
public class powerornumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr number : ");
        int n =sc.nextInt(),m=sc.nextInt();
        sc.close();
        System.out.println("Power of "+ n + " ^ " + m + " : "+pow(n,m));
    }
    static int pow(int x,int y){
        if(y==0){
            return 1;
        }
        /*first method */
        int ans = pow (x, y/2);
        if(y%2==0){
            return ans * ans;
        }
        else{
           return ans * ans * x;
        }
        /*
       // Second method
        
        return pow(x,y-1)*x;
        */
    }    
    
}


