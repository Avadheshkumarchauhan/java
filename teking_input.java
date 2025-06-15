import java.util.Scanner;

public class teking_input {
    public static void main(String[] args) {
             Scanner sc =new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name=sc.nextLine();
            System.out.println("My name is "+name);

            System.out.print("Enter number : ");
            int number=sc.nextInt();
            System.out.println("Number = "+number);
            sc.close();
        }
    
}
