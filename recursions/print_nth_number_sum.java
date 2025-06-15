package recursions;
import java.util.Scanner;

public class print_nth_number_sum {
    public static int seriessum(int x){
        if(x<1){
            return x;
        }
        else{
            return seriessum(x-1)+x;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n =sc.nextInt();
        System.out.println("Sum of number : "+seriessum(n));

        sc.close();
    }    
}
