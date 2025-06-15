import java.util.Scanner;
public class countOfDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt(),count=0;
        for(int i=num;i>0;i/=10){
            count++;

        }
        System.out.println("Count of digit in "+num+" : "+count);
        sc.close();
    } 
}
