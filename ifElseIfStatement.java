import java.util.Scanner;

public class ifElseIfStatement {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter age : ");
            int age=sc.nextInt();
            String st="";
            if (age<=12){
                st=" child ";
            }
            else if (age>12 && age<18){
                st="Teenager";
            }
            else{
                st="Adult";
            }
            System.out.println("Age "+st);
            sc.close();
                
        }
}
    

