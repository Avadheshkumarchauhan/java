import java.util.Scanner;

public class whileLoopPrint1ToN {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num=1,number=sc.nextInt();
        while(num<=number){
            System.out.print(num+"\t");
            num++; 
        }
        sc.close();
 }   
}
