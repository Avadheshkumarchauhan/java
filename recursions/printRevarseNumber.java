package recursions;
import java.util.Scanner;

public class printRevarseNumber {
    /*
    static void printincriging(int N){

        if (N==0){
            return;
        }

        System.out.println(N);
        printincriging(N-1);
    }

    /*or*/
    static int printincriging(int N) {
        if (N <1) {
            return 0;
        }
        System.out.println(N);
       return printincriging(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        sc.close();
        printincriging(n);
    }

}
