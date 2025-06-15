import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter row : ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
                for(int j=i;j<= row;j++){
                    System.out.print(j);
                }
                for(int k=1;k<=i-1;k++){
                    System.out.print(k);
                }
            
            System.out.println();
        }
        sc.close();
    }
    
    
}
