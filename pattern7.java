import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter row & collumn : ");
        int row=sc.nextInt(),col=sc.nextInt();
        for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    System.out.print(j);
                }
            
            System.out.println();
        }
        sc.close();
    }
    
    
}
