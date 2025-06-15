import java.util.Scanner;

public class ternary_basic {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int x=sc.nextInt();
        String s= (x%2==0)?"even":"odd";
        System.out.println(s);
       // System.out.println("Number is even And divided by 3");
        if(x%2==0 && x%3==0){
            System.out.println("This number is Even And divided by 3 : "+x);
        }
        else if(x%2==0){
            System.out.println("Even numer : "+x);
        }
        else{
            System.out.println("This number is not even and not divided by 3 : " +x);
        }
        System.out.print("Enter number : ");
        int y=sc.nextInt();
        if(y%3==0||y%5==0){
            System.out.println("Divided by 3 or 5 is : "+y);
        }
        else{
            System.out.println("Not divided by 3 or 5 : "+y);
        }

        sc.close();
    }
    
}
