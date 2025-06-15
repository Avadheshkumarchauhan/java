import java.util.Scanner;

public class basi1 {
    public static void main(String[] args) {
        
        Scanner ob1 =new Scanner(System.in);
        System.out.print("Enter number : ");
        int x=ob1.nextInt();
        System.out.println(x);
        System.out.print("Enter String : ");
        char ch =ob1.next().charAt(0);
        System.out.println(ch);
        System.out.println("hek"+2+5+"hello");
        ob1.close();
    }
    
}
