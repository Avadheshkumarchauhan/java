package recursions;
import java.util.Scanner;
 public class countofdigit{
    static int cod(int x){

        if(x>=0 && x<=9){
            return 1;
        }        
        return cod(x/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr number : ");
        int n =sc.nextInt();
        sc.close();
        System.out.println("Number of "+ n +" digit : "+cod(n));
    }    
}

