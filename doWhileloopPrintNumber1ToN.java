import java.util.Scanner;

public class doWhileloopPrintNumber1ToN {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter number 1 to n : ");
    int number=sc.nextInt(),num=1;
    do{
        System.out.println(num);
        num++;
    }while(num<=number);

    sc.close();
}    
}
