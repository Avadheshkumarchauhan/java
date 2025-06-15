import java.util.Scanner;
class variabl{
    int x,y;
    int sum (){
        int sum=x+y;
        return sum;
    }
}

public class sumUsingMethod {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        variabl ob=new variabl();
        System.out.print("Enter two number : ");
        ob.x=sc.nextInt() ;  ob.y=sc.nextInt();
        System.out.println("sum : "+ob.sum());
        sc.close();
    }
    
}
