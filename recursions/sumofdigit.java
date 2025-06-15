package recursions;
import java.util.Scanner;

public class sumofdigit {
    static int sod(int x){
        if(x>=0 && x<=9){
            return x;
        }
        return sod(x/10)+x%10;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr number : ");
        int n =sc.nextInt();
        sc.close();
        System.out.println("Sum of "+ n +" digit : "+sod(n));
    }    
}
