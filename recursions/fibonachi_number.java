package recursions;
import java.util.Scanner;

public class fibonachi_number {
    static int febinachi(int n){
        if(n==0||n==1){
            return n;
        }
        return febinachi(n-1)+febinachi(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entr febonachi number : ");
        int fb=sc.nextInt(),i;
        sc.close();
        for(i=0;i<fb;i++){
            System.out.println(febinachi(i));
        }
    }
}
