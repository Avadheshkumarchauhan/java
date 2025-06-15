import java.util.Scanner;

public class stringToChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print(("Enter string : "));
        char ch=sc.next().charAt(0);
        System.out.println("First charater of string :"+ch);
        sc.close();
     }
    
}
