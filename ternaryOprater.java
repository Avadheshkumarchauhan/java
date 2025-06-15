import java.util.Scanner;

public class ternaryOprater {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter age : "); 
    int age=sc.nextInt();
    String opration;
    opration=(age>=18)?"vote":"not vote";
    System.out.println("He/She is "+opration);

    sc.close();
}    
}
