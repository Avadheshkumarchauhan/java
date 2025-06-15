import java.util.Scanner;

class person1{
    public  void mens(){
        System.out.println("helloṇ");
    }
    public int sum(int x,int y){
        return x+y;
    }
}

public class method_basic {
    public static void mens(){
        System.out.println("hello");
    }
   
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter number : ");
        int a=sc.nextInt(),b=sc.nextInt();
        person1 ob =new person1();
        int ans =ob.sum(a, b);
  
        System.out.println("sum : "+ans);
         mens();
        ob.mens();
        
        
        System.out.println( "Math function ===");
        System.out.println(Math.sqrt((36)));
        sc.close();
    }
    
}
