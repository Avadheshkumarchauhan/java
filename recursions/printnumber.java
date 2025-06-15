package recursions;
import java.util.Scanner;

public class printnumber {
    static void printincriging(int N) {
        if (N < 1) {
            return;
        }
         printincriging(N - 1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        sc.close();
        printincriging(n);
     }

}