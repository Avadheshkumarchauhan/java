package recursions;
import java.util.Scanner;

public class nthmultiplenumberprint {

   public static void printmultiple(int x,int y){

        if(y<1){
            return ;
        }
        else{
            printmultiple(x, y-1);
            System.out.print(x*y+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number : ");
        int n=sc.nextInt(),k=sc.nextInt();
        printmultiple(n,k);
        sc.close();
    }
    
}
