import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter row & collumn : ");
        int row=sc.nextInt(),col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
    
}
