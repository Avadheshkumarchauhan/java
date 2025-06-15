package recursions;
import java.util.Scanner;

public class print_table {
    public static void table(int x,int y){
        if(y<1) {
            return ;
        }
        else{
            table(x, y-1);
            System.out.println(x+" x "+y+" = "+x*y);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter table number : ");
        int n=sc.nextInt(),y=10;
        table(n,y);
        sc.close();
    }
    
}
