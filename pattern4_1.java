import java.util.Scanner;

public class pattern4_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter row : ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row+1-i);j++){
                
                System.out.print("* ");
                                
                
            }
            System.out.println();
        }
        sc.close();
    }
    
}
