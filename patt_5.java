import java.util.Scanner;

public class patt_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter odd number : ");
        int c=sc.nextInt();
        int i=1,j=1,d=c/2+1;
        for(i=1;i<=c;i++){
            for(j=1;j<=c;j++){
                if(i==1||i==d||i==c||j<=1 && i<=d||i>=d &&j==c){                   
                        System.err.print("*");
                      }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}